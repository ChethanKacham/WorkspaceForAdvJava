package test;
import java.util.*;

public class Ex6dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		data.forEach( x -> {
			if (x%2 != 0)
				System.out.println(x);
		});

	}

}