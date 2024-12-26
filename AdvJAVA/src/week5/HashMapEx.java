package week5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("New York City", 840000);
		hmap.put("Houston", 220000);
		hmap.put("Los Angeles", 390000);
		hmap.put("Chicago", 270000);
		hmap.put("Denver", 640000);
		hmap.put("Kansas City", 460000);
		
		if(hmap.containsKey("Kansas City"))
			System.out.println("Population of Kansas City is " + hmap.get("Kansas City"));
		
		Iterator<Map.Entry<String, Integer>> itr = hmap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> m = itr.next();
			System.out.println(m.getKey()+ " : " + m.getValue());
		}

	}

}
