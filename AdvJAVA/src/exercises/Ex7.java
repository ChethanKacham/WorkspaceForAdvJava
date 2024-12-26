package exercises;

import java.util.Arrays;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("Adam", "Bob", "Carol", "Dave");
		System.out.println(data.stream().mapToInt(str -> str.length()).reduce(0, (x,y) -> x+y));

	}

}
