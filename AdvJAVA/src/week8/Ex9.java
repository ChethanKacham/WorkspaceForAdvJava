package week8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"A","B","C","D","E","F"};
		
		System.out.println(Arrays.stream(words).reduce((w1, w2) -> w1+w2).get());
		
		System.out.println(Arrays.stream(words).collect(Collectors.joining()));
//		List<String> words = Arrays.asList("A","B","C","D","E","F");
//		
//		System.out.println(words.stream().reduce((w1, w2) -> w1+w2).get());
//		
//		System.out.println(words.stream().collect(Collectors.joining()));
	}

}
