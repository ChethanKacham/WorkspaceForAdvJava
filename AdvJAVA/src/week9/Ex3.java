package week9;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Data {
	String name, rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
}

public class Ex3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stream<String> lines = Files.lines(
				Paths.get(args[0]).toAbsolutePath()
				).skip(1);
		
		List<Data> movies = lines.map(str -> {
			return extracted(str);
		}).collect(Collectors.toList());
		
		System.out.println("Total number of movies = " + movies.size());
		
		System.out.println("Total number of ratings = " + 
				movies.stream().map(movie -> movie.getRating())
				   .collect(Collectors.toSet()).size());
					   
		movies.stream().collect(Collectors.groupingBy(
				Data::getRating,
				Collectors.counting()
				)).forEach((k,v) -> System.out.println(k + " = " + v));
		
	}

	private static Data extracted(String str) {
		String[] strings = str.split(",");
		Data data = new Data();
		
		data.setName(strings[1]);
		data.setRating(strings[7]);
		return data;
	}

}
