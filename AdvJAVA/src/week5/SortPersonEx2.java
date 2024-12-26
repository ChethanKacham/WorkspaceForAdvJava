package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person2{
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age + "\n";
	}
	
}

public class SortPersonEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person2> data = new ArrayList<Person2>();
		
		data.add(new Person2("John", 27));
		data.add(new Person2("Sarah", 37));
		data.add(new Person2("Peter", 22));
		data.add(new Person2("Sarah", 24));
		data.add(new Person2("Ajay", 29));
		data.add(new Person2("Susan", 22));
		
		System.out.println(data);
		
		Comparator<Person2> cmp = new Comparator<Person2>() {
			public int compare(Person2 p1, Person2 p2) {
				int nameCmp = p1.name.compareTo(p2.name);
				int ageCmp = p1.age >= p2.age ? 1:-1;
				
				return (nameCmp == 0) ? ageCmp :nameCmp;
			}
		};
		
		Collections.sort(data, cmp);
		
		for(Person2 p: data)
			System.out.println(p);

	}

}
