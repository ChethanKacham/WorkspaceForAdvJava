package assignments;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
//import java.util.stream.Collectors;
//import static java.util.stream.Collectors.joining;


class Book {
    private String title;
    Set<String> tagList = new TreeSet<String>();

    public Book(String title) {
        this.title = title;
    }

    Book addTag(String tag) {
        this.tagList.add(tag);
        return this;
    }

    Set<String> getTags() {
    	return this.tagList;
    }

    public String getTitle() {
        return this.title;
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
        // ADD YOUR CODE HERE
        // Should be just one statement
		//  return books.stream().map(Book::getTitle).collect(joining(", "));
		//	return books.stream().map(book -> book.getTitle()).collect(Collectors.joining(", "));
		return books.stream()
                .map(book -> book.getTitle())
                .reduce((book1, book2) -> book1 + ", " + book2).get();
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
