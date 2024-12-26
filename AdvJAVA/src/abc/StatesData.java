package abc;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class States{
	
	String city;
	String state;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}

public class StatesData {

	public static void main(String[] args) throws Exception {
		Stream<String> lines = Files.lines(
				Paths.get(args[0]).toAbsolutePath()
				);

		List<States> data = lines.map(str -> {
			String[] string = str.split(",");
			States states = new States();
			states.setCity(string[0]);
			states.setState(string[1]);
			return states;
			}).collect(Collectors.toList());
	
		//code to print count of total number of states by removing duplicates.
		System.out.println("The total no.of states = " + 
						data.stream().map(x -> x.getState()).distinct().count());
		
		// code to print states which statrts with letter M
		data.stream().map(x -> x.getState()).distinct()
		.filter(s -> s.startsWith("M")).forEach(System.out :: println);
		
		
		// code to print state which has highest number of ciities. 
        Map<String,Long> hMap = new HashMap<String,Long>();
		Map<String,Long> result = new LinkedHashMap<>();
		
		data.stream().collect(Collectors.groupingBy(
				States :: getCity,
				Collectors.counting()
				)).forEach((k,v) -> hMap.put(k,v));
		
		hMap.entrySet().stream().sorted(Map.Entry.<String,Long> comparingByValue().reversed())
		.forEach(y -> result.put(y.getKey(),y.getValue()));
		
		result.entrySet().stream().limit(1).forEach(System.out :: println);
		
									
		}
	}

