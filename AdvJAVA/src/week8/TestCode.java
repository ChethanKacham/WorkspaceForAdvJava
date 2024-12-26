package week8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> depts = Arrays.asList(
				"Marketing", "Mathematics", "Chemistry", "Mathematics", "Physics", "Marketing",
				"Physics", "Marketing", "Business", "Business");
		
		Comparator<Person> cmp = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				int nameCmp = p1.getName().compareTo(p2.getName());
				int ageCmp = p1.getAge() > p2.getAge() ? 1 : -1;

				return nameCmp == 0 ? ageCmp : nameCmp;
			}
			
		};
		
		depts.stream().collect(Collectors.groupingBy(
				Function.identity(), Collectors.counting())
				).forEach((dept, count) -> System.out.println(dept + " : " + count));
		
		depts.stream().collect(Collectors.groupingBy(name -> name.charAt(0)))
					.forEach((ch, name ) -> System.out.println(ch + " : " + name));
				

	}

}
