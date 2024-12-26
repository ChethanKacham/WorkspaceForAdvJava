package week8;

import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.generate(() -> 1).limit(5).forEach(System.out::println);
		
		Stream.generate(Math::random).limit(5).forEach(System.out::println);

	}

}
