package week9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		hmap.put("New York City", 840000);
		hmap.put("Houston", 220000);
		hmap.put("Los Angeles", 390000);
		hmap.put("Chicago", 270000);
		hmap.put("Denver", 640000);
		hmap.put("Kansas City", 460000);
		
//		System.out.println(hmap);
		
		Map<String, Integer> ret = new LinkedHashMap<>();
		
		hmap.entrySet().stream()
			.sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
			.forEach(x -> ret.put(x.getKey(), x.getValue()));
		
		//hmap.entrySet().stream().forEach(x -> System.out.println(x.getKey()+ " " + x.getValue()));
		//hmap.forEach((key, value) -> System.out.println(key + " " + value));
		
		System.out.println(ret);
	}

}
