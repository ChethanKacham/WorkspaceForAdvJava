package abc;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Population{
	
	String name;
	int population;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

}

public class SortPopulation{
	
	public static void main(String[] args) throws Exception {
			
			Stream<String> lines = Files.lines(
					Paths.get(args[0]).toAbsolutePath()
					).skip(1);

			List<Population> data = lines.map(str -> {
				String[] string = str.split(",");
				Population population = new Population();
				population.setName(string[0]);
				population.setPopulation(Integer.parseInt(string[1]));
				return population;
				
			}).collect(Collectors.toList());
			
			Map<String,Integer> hMap = new HashMap<String, Integer>();
			Map<String,Integer> result = new LinkedHashMap<>();
			
			data.stream().forEach(x -> hMap.put(x.getName(), x.getPopulation()));
			
			hMap.entrySet().stream().sorted(Map.Entry.<String,Integer> comparingByValue().reversed())
										.forEach(y -> result.put(y.getKey(),y.getValue()));
			
			System.out.println(result);
			
	}

}


