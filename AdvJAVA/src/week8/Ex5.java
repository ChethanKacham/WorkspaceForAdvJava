package week8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> depts = Arrays.asList(
				"Marketing", "Mathematics", "Chemistry", "Mathematics", "Physics", "Marketing",
				"Physics", "Marketing", "Business", "Business");
		
//		Map<String, Long> ret = depts.stream().collect(Collectors.groupingBy(
//				dept -> dept, 
//				Collectors.counting()
//				));
//		
//		ret.forEach((dept, count) -> System.out.println(dept + ": " + count));
		
		depts.stream().collect(Collectors.groupingBy(
//				dept -> dept,
				Function.identity(),
				Collectors.counting()
				)).forEach((dept, count) -> System.out.println(dept + ": " + count));;

	}

}
