package test;

import java.util.Arrays;

public class Mid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.stream(arr).reduce(0,(a,b) -> a < b ? a:b));

	}

}
