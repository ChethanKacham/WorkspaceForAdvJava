package abc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Book {
    private String title;
    private Set<String> tags;

    public Book(String title) {
        this.title = title;
        tags = new HashSet<>();
    }

    public Book addTag(String tag) {
        tags.add(tag);
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getTags() {
        return tags;
    }
}

public class BookClub {
	
	public static List<Book> getBooks() {
		 Book book1 = new Book("Java in Action")
		 .addTag("Java").addTag("Programming");
		 Book book2 = new Book("SQL in Action")
		 .addTag("SQL").addTag("Database").addTag("Programming");
		 Book book3 = new Book("Python in Action")
		 .addTag("Python").addTag("Programming");
		 Book book4 = new Book("Machine Learning in Action")
		 .addTag("Statistics");
		return Stream.of(book1, book2, book3, book4)
		 .collect(toList());
		 }
		 public static String getAllBookTitles(List<Book> books) {
			 return books.stream().map(book -> book.getTitle()).
					 reduce((total, value) -> total + ", " + value).get();
				
	}


	public static void main(String[] args) {
		List<Book> books = getBooks();
		 books.forEach(book -> System.out.println(book.getTags()));
		 System.out.println();
		 System.out.println(getAllBookTitles(books));
		 System.out.println();
		 books.stream()
		.map(book -> book.getTags().contains("Programming"))
		.forEach(System.out::println);
	}

}
