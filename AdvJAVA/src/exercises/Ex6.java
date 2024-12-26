package exercises;

import java.util.Arrays;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		data.forEach((n) -> {
			if(n%2 != 0)
				System.out.println(n);
		});

	}

}
