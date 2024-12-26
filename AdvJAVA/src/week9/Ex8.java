package week9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Predicate<Integer> greaterThan5 = x -> x > 5;
		Predicate<Integer> lessThan8 = x -> x < 8;
		
		data.stream().filter(greaterThan5.and(lessThan8)).forEach(System.out::println);

	}

}