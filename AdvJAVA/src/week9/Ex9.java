package week9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("A","AA","AAA","B","BB","BBB");
		
		Predicate<String> lengthIs3 = x -> x.length() == 3;
		Predicate<String> startWithA = x -> x.startsWith("A");
		
//		data.stream().filter(startWithA.or(lengthIs3)).forEach(System.out::println);
		
		data.stream().filter(startWithA.negate()).forEach(System.out::println);

	}

}
