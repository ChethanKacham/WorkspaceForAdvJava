package week7;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Pear");
		fruits.add("Mango");
		
		fruits.forEach( x -> System.out.println(x));
//		fruits.forEach(System.out::println);

	}

}
