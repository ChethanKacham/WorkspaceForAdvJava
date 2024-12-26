package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Abc {
	void abc();
}

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<String> depts = Arrays.asList(
				"Marketing", "Mathematics", "Chemistry", "Mathematics", "Physics", "Marketing",
				"Physics", "Marketing", "Business", "Business");
		List<String> data1 = Arrays.asList("Adam", "Bob", "Carol", "Dave");
		
		System.out.println(data1.stream().mapToInt(x -> x.length()).reduce(0, (x,y) -> x+y));
				
//		data.forEach(i -> System.out.println(i));
		//data.forEach(System.out::println);
		Abc obj = () -> System.out.println("Hello");
		obj.abc();
		data.stream().filter(i -> i%2!=0).forEach(System.out::println);
		
		depts.stream().collect(Collectors.groupingBy(
				//dept -> dept,
				Function.identity(),
				Collectors.counting()))
				.forEach((dept, count) -> System.out.println(dept + ": " + count));
		
		depts.stream().collect(Collectors.groupingBy(name -> name.charAt(0)))
						.forEach((name, dept) -> System.out.println(name + ": " + dept));
	}

}
