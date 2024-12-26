package week3;

import java.util.Arrays;
import java.util.List;

public class WildCradExample {
	
	static int count(List <? extends Number> data) {
		int count = 0;
		for (Number n : data) 
			count ++;
		return count;
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4,5,6,7);
		List<Double> list2 = Arrays.asList(4.3,5.6,6.8,7.7);
		
		System.out.println("List1 contains " + count(list1) + "elements");
		System.out.println("List2 contains " + count(list2) + "elements");

	}

}
