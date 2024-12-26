package week7;

import java.util.HashMap;
import java.util.Map;

interface Abc {
	public void Abcd();
}
public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = () -> System.out.println("Hello");
		
//		obj.Abcd();
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("New York City", 840000);
		hmap.put("Houston", 220000);
		hmap.put("Los Angeles", 390000);
		hmap.put("Chicago", 270000);
		hmap.put("Denver", 640000);
		hmap.put("Kansas City", 460000);
		
		hmap.forEach((key, value)-> System.out.println(key + " : " + value));
			
		hmap.entrySet().stream().forEach(x -> System.out.println((x.getKey() + " : " + x.getValue())));
		

	}

}
