package abc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Data {
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class myEx {

	public static void main(String[] args) throws IOException {
		
		Stream<String> lines = Files.lines(
				Paths.get((args[0])).toAbsolutePath()
				).skip(1);
		
		List<String> movies = lines.map(s -> s
		).collect(Collectors.toList());
		
		
		movies.stream().collect(Collectors.groupingBy(s -> s,
				Collectors.counting()))
				.forEach((d, count) -> System.out.println(d +":" + count));

	}

}

// code to print all subject names and diplay count of their occurence