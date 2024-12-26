package week8;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = new ArrayList<Integer>();
		
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		
//		data.stream().map(x -> x*x).forEach(System.out::println);
		
		System.out.println(data.stream().map(x -> x*x).reduce(0, (x,y) -> x+y));
		
		System.out.println(data.stream().map(x -> x*x).reduce(1, (x,y) -> x*y));
	}

}
