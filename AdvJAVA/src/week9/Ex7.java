package week9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Developer {
	
	String name;
	Set<String> book;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}

	void addBook(String book) {
		if(this.book == null)
			this.book = new HashSet<>();
		
		this.book.add(book);
	}
	
}

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer data1 = new Developer();
		
		data1.setName("John");
		data1.addBook("Java 8 in Action");
		data1.addBook("Spring Boot in Action");
		
		Developer data2 = new Developer();
		
		data2.setName("Sarah");
		data2.addBook("Learning Python");
		data2.addBook("Effective Java");
		
		List<Developer> data = new ArrayList<Developer>();
		data.add(data1);
		data.add(data2);
		
//		data.stream().map(x -> x.getBook())
//					.flatMap(x -> x.stream())
//					.filter(x -> !x.toLowerCase().contains("python"))
//					.collect(Collectors.toSet())
//					.forEach(System.out::println);
		
		data.stream()
			.flatMap(x -> x.getBook().stream())
			.filter(x -> !x.toLowerCase().contains("python"))
			.collect(Collectors.toSet())
			.forEach(System.out::println);

	}

}
