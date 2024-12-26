package week9;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] array = new String[][] {
			{"a", "b"}, {"c", "d"},{"e", "f"}};
		
		String[] ret = Stream.of(array).flatMap(Stream::of)
				.toArray(String[]::new);
//		String[] ret = Stream.of(array).flatMap(Arrays::stream)
//				.toArray(String[]::new);
		for(String s : ret)
			System.out.println(s);
		

	}

}
