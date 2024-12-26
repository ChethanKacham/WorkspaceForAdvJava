package week7;

import java.util.stream.Stream;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of("Hello", "World", "Today").forEach(
				x -> System.out.println(x)
				);
		System.out.println("==============");
		Stream.of("Hello", "World", "Today").parallel().forEach(
				x -> System.out.println(x)
				);
		

	}

}
