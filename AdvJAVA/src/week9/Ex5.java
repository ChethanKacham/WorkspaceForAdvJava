package week9;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data1 = {1,2,3,4,5};
		int[] data2 = {10,9,8,7,6};
		
		System.out.println("The total is " + 
					Stream.of(data1, data2)
						.flatMapToInt(x -> Arrays.stream(x))
						.peek(System.out::println)
						.sum());
//		System.out.println("The total is " + 
//				Stream.of(data1, data2)
//					.flatMapToInt(Arrays::stream)
//					.peek(System.out::println)
//					.sum());
		
	}

}
