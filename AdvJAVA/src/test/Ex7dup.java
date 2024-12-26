package test;

import java.util.*;

public class Ex7dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("Adam", "Bob", "Carol", "Dave");
		// ADD YOUR CODE HERE – SHOULD BE JUST ONE STATEMENT
		System.out.println(data.stream().mapToInt(x -> x.length()).reduce(0, (x,y) -> x+y));
		}

}