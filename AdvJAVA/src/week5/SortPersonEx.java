package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age + "\n";
	}
	
	@Override
	public int compareTo(Person p) {
		int nameCmp = this.name.compareTo(p.name);
		int ageCmp = this.age > p.age ? 1:-1;
		
		return (nameCmp == 0) ? ageCmp : nameCmp;
	}
	
}

public class SortPersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> data = new ArrayList<Person>();
		
		data.add(new Person("John", 27));
		data.add(new Person("Sarah", 37));
		data.add(new Person("Peter", 22));
		data.add(new Person("Sarah", 24));
		data.add(new Person("Ajay", 29));
		data.add(new Person("Susan", 22));
		
		System.out.println(data);
		
		Iterator<Person> itr = data.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Collections.sort(data);
		
		System.out.println("---------------");
		
		for(Person p: data)
			System.out.println(p);
	}
	
	

}
