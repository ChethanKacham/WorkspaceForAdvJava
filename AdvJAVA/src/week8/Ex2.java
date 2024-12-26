package week8;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] numbers = {};
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10}; 
		System.out.println(Arrays.stream(numbers).sum());
		System.out.println(Arrays.stream(numbers).count());
		System.out.println(Arrays.stream(numbers).max());
		System.out.println(Arrays.stream(numbers).min());

	}

}
