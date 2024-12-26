package test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Data {
	String name;
	String rating;

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

public class Week9Dup {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stream<String> lines = Files.lines(
				Paths.get(args[0]).toAbsolutePath()).skip(1);
		
		List<Data> movies = lines.map(str -> {
			String[] abc = str.split(",");
			Data data = new Data();
			data.setName(abc[1]);
			data.setRating(abc[7]);
			return data;
		}).collect(Collectors.toList()); 
		
		System.out.println(movies.stream().map(x -> x.getRating()).collect(Collectors.toSet()).size());
		
		movies.stream().collect(Collectors.groupingBy(Data::getRating, Collectors.counting()))
				.forEach((rating, number) -> System.out.println(rating + " " + number));
	}

}
