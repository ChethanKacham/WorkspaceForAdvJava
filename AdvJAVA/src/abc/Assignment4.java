package abc;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MovieData{
	String name , rating;
	int theatre;
	double earnings;
	Map<String,Integer> studioTheatreMap;
	
	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

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
	
	public Integer getTheatre() {
		return theatre;
	}

	public void setTheatre(int theatre) {
		this.theatre = theatre;
	}
	
	public Map<String, Integer> getStudioTheatreMap() {
		return studioTheatreMap;
	}

	public void setStudioTheatreMap(String studioName, Integer theatre) {
		if(this.studioTheatreMap == null)
			this.studioTheatreMap = new HashMap<String,Integer>();
		this.studioTheatreMap.put(studioName, theatre);
	}
	
}

public class Assignment4 {

	public static void main(String[] args) throws Exception{
		
		Stream<String> lines = Files.lines(
								Paths.get(args[0]).toAbsolutePath()
								).skip(1);
		
		List<MovieData> movies = lines.map(str -> {
					return extracted(str);
		            }).collect(Collectors.toList());
		
		System.out.println("The total number of movies : " + movies.size());
		
		System.out.println( "\nThe total number of theatres for Sony : " + 
				   movies.stream().map(studio -> studio.getStudioTheatreMap())
				   .filter(key -> key.containsKey("Sony"))
				   .flatMap(val -> val.values().stream().limit(5)));
				   
				   
		
		Map<String,Integer> hMap = new HashMap<String, Integer>();
		Map<String,Integer> ret  = new LinkedHashMap<>();
		
		movies.stream().forEach( x -> hMap.put(x.getName(), x.getTheatre()));
		
		System.out.println("\n\n\n");
		hMap.entrySet().stream().limit(2).map(s -> s.getValue()).filter(s -> s.equals("Solo")).forEach(System.out :: println);
		
		System.out.println("\nThe top 10 number of theaters with movie names in descending order :");
		hMap.entrySet().stream().sorted(Map.Entry.<String,Integer> comparingByValue().reversed()).limit(10)
		.forEach(y -> ret.put(y.getKey(),y.getValue()));

		ret.entrySet().stream().forEach(x -> System.out.println( x.getKey() + ":" + x.getValue()));
		
//		System.out.println("\nThe top 10 number of theaters with movie names in descending order :");
//		movies.stream().sorted((a, b) -> b.getTheatre() - a.getTheatre()).limit(10).
//					forEach(x -> System.out.println( x.getName() + ":" + x.getTheatre()));
		
		System.out.println("\nThe rating counts for :");
		movies.stream().collect(Collectors.groupingBy(
				MovieData :: getRating,
				Collectors.counting()
				)).forEach((key,value) -> {
					if(!key.contains("N/A"))
					System.out.println(key + " = " + value);
				});
		
		System.out.println("\nThe average earnings for ratings :");
		movies.stream().collect(Collectors.groupingBy( MovieData :: getRating, Collectors.averagingDouble(d -> d.getEarnings())))
						.forEach((key,value) -> {
							if(!key.contains("N/A"))
								System.out.printf("%s = %.2f\n", key, value);
						});
		
//		System.out.println("\nThe average earnings for ratings :");
//		movies.stream().collect(Collectors.groupingBy(MovieData ::getRating, Collectors.averagingDouble(d -> d.getEarnings())))
//		                .entrySet().stream().filter(x -> !x.getKey().equals("N/A"))
//		                .forEach((e) -> System.out.printf("%s = %.2f\n", e.getKey(), e.getValue()));
		
	}

	private static MovieData extracted(String str) {
		String[] strings = str.split(",");
		MovieData data = new MovieData();
		data.setName(strings[1]);
		data.setStudioTheatreMap(strings[2], Integer.parseInt(strings[4]));
		data.setRating(strings[7]);
		data.setEarnings(Integer.parseInt(strings[3]));
		data.setTheatre(Integer.parseInt(strings[4]));
		return data;
	}

}
