package week9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person1 {
	String name;
	int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "{ Name : " + name + ", Age : " + age + "}"; 
	}
}

class User1 {
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

	@Override
	public String toString() {
		return "{ Name : " + name + ", Age : " + age + "}"; 
	}	
	
	
}

public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		hmap.put("NewYork", 8000);
		hmap.put("Houston", 5000);
		hmap.put("Los Angeles", 3900);
		hmap.put("Chicago", 2700);
		hmap.put("Denver", 6400);
		hmap.put("Kansas City", 4600);
//		
		HashMap<String,Integer> ret = new LinkedHashMap<String,Integer>();
//		
//		hmap.entrySet().stream()
//					.sorted(Map.Entry.<String,Integer> comparingByValue().reversed())
//					.forEach(x -> ret.put(x.getKey(), x.getValue()));
//		
//		System.out.println(ret);
		
		
		hmap.entrySet().stream().sorted(
				Map.Entry.<String, Integer> comparingByValue().reversed())
				.forEach(x -> ret.put(x.getKey(),x.getValue()));
		
		List<Person1> data = new ArrayList<Person1>();
		data.add(new Person1("John",27));
		data.add(new Person1("Sarah",37));
		data.add(new Person1("Sarah",24));
		data.add(new Person1("Peter",22));
		data.add(new Person1("Ajay",29));
		data.add(new Person1("Susan",22));
		
		
		List<User1> user = new ArrayList<User1>();
		
//		user = data.stream().map(p -> {
//					User1 usr = new User1();
//					usr.setName(p.getName());
//					usr.setAge(p.getAge());
//					return usr;
//		}).collect(Collectors.toList());
//					 	
//		for(User1 usr: user) 
//			System.out.println(usr);
		
//		data.stream().map(p -> {
//			User1 usr = new User1();
//			usr.setName(p.getName());
//			usr.setAge(p.getAge());
//			return usr;
//		}).collect(Collectors.toList())
//				.stream().filter(u -> u.getAge()>30)
//				.forEach(System.out::println);
		
		user = data.stream().map(p -> {
		User1 usr = new User1();
		usr.setName(p.getName());
		usr.setAge(p.getAge());
		
		return usr;
		
		}).collect(Collectors.toList());
		
		for(User1 usr: user)
			System.out.println(usr);
		
	
	}

}
