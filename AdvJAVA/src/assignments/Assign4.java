package assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Data {
	String moviename, studioname, theater, rating;
	Double earning;

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getStudioname() {
		return studioname;
	}

	public void setStudioname(String studioname) {
		this.studioname = studioname;
	}

	public Double getEarning() {
		return earning;
	}

	public void setEarning(Double earning) {
		this.earning = earning;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Data [moviename=" + moviename + ", studioname=" + studioname + ", theater=" + theater + ", rating="
				+ rating + ", earning=" + earning + "]";
	}
	
}

public class Assign4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stream<String> lines = Files.lines(
				Paths.get("./movie.csv").toAbsolutePath()
				).skip(1);
		
		// Stored the movie data into the list
		List<Data> movies = lines.map(str -> {
			String[] strings = str.split(",");
			Data data = new Data();
			
			data.setMoviename(strings[1]);
			data.setStudioname(strings[2]);
			data.setTheater(strings[4]);
			data.setEarning(Double.parseDouble(strings[5]));
			data.setRating(strings[7]);
			
			return data;
		}).collect(Collectors.toList());
		
		// Total number of movies
		System.out.println("Total number of movies = " + movies.size());
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		// Total number of theaters for Sony
		System.out.println("Total number of theaters for Sony = " + 
								movies.stream().filter(x -> x.getStudioname().equals("Sony"))
											.map(x -> Integer.parseInt(x.getTheater())).reduce(0, (x,y) -> x + y));
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		// Top 10 theaters in descending order with movie name and the number of theaters
		Comparator<Data> cmp = new Comparator<Data>() {
			public int compare(Data t1, Data t2) {
				int theatreCountCmp = Integer.parseInt(t1.getTheater()) > Integer.parseInt(t2.getTheater()) ? -1 : 1;

				return theatreCountCmp;
			}
		};
		
		System.out.println("Top 10 theaters in descending order with movie name and the number of theaters :- ");
				movies.stream().sorted(cmp).limit(10).collect(Collectors.toList())
						.forEach(x -> System.out.println(x.getMoviename()+ " : "+x.getTheater()));
				
		System.out.println("-----------------------------------------------------------------------------------");

		// Rating counts for PG-13, R, G, and PG – excluding N/A
		System.out.println("Rating counts for PG-13, R, G, and PG - excluding N/A :- ");
				movies.stream().filter(x -> !x.getRating().equals("N/A"))
						.collect(Collectors.groupingBy(x -> x.getRating(), Collectors.counting()))
						.forEach((rating, count) -> System.out.println(rating + " : " + count));
				
		System.out.println("-----------------------------------------------------------------------------------");
		
		// Average earning for PG-13, R, G, and PG - excluding N/A
		System.out.println("Average earning for PG-13, R, G, and PG - excluding N/A :-");
				movies.stream().filter(movie -> !movie.getRating().equalsIgnoreCase("N/A"))
				.collect(Collectors.groupingBy(x -> x.getRating(), Collectors.averagingDouble(y -> y.getEarning())))
				.forEach((rating, avg) -> System.out.println(rating + " : " + avg));

	}

}