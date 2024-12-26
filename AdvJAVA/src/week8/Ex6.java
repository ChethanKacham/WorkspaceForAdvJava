package week8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	
	
}

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> data = new ArrayList<Person>();
		
		data.add(new Person("John",27));
		data.add(new Person("Sarah",37));
		data.add(new Person("Sarah",24));
		data.add(new Person("Peter",22));
		data.add(new Person("Ajay",29));
		data.add(new Person("Susan",22));
		
		System.out.println(data);
		
		Comparator<Person> cmp = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				int nameCmp = p1.getName().compareTo(p2.getName());
				int ageCmp = p1.getAge() > p2.getAge() ? 1:-1;
				
				return nameCmp == 0 ? ageCmp : nameCmp; 
			}
		};	
//		Comparator<Person> cmp1 = (Person p1, Person p2) -> {
//		int nameCmp = p1.getName().compareTo(p2.getName());
//		int ageCmp = p1.getAge() > p2.getAge() ? -1:1;
//		
//		return nameCmp == 0 ? ageCmp : nameCmp; 
//};

		data.stream().sorted(cmp).forEach(System.out::println);
		
	}

}
