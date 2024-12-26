package abc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Books {
	
	String booktitle;
    String cateogry;
    int isbn;
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getCateogry() {
		return cateogry;
	}
	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	Map<String,Integer> studioTheatreMap;
	
	public Map<String, Integer> getStudioTheatreMap() {
		return studioTheatreMap;
	}

	public void setStudioTheatreMap(String cateogry, Integer isbn) {
		if(this.studioTheatreMap == null)
			this.studioTheatreMap = new HashMap<String,Integer>();
		this.studioTheatreMap.put(cateogry, isbn);
	}
	@Override
	public String toString() {
		return "Books [booktitle=" + booktitle + ", cateogry=" + cateogry + ", isbn=" + isbn + "]";
	}
	
	
		
}
public class myEx3 {

	public static void main(String[] args) throws IOException {
		
		Stream<String> lines = Files.lines(
				Paths.get(args[0]).toAbsolutePath()
				).skip(1);
		
		List<Books> data = lines.map(str -> {
   			String[] string = str.split(",");
   			Books book = new Books();
   			book.setBooktitle(string[0]);
   			book.setIsbn(Integer.parseInt(string[1]));
   			book.setCateogry(string[2]);
   			return book;
   			
   		}).collect(Collectors.toList());
           
           
           Map<String, String> hMap = new HashMap<String, String>();
   		
   		data.stream().forEach(x -> hMap.put(x.getBooktitle(), x.getCateogry()));
   		
                  hMap.forEach ( (Key, value) -> {
   			
			if("Computer Graphics".equals(value))
   				System.out.println(Key);
   		}); 
               
               Map<String, Integer> hMap1 = new HashMap<String, Integer>();
       		
       		data.stream().forEach(x -> hMap1.put(x.getCateogry(), x.getIsbn()));

       		
       		
			/*
			 * Stream.of(hMap1).limit(5).forEach ((key, value) -> {
			 * 
			 * if("Java".equals(value)) System.out.println(key);
			 * 
			 * });
			 */
       		
       		System.out.println( "\n First five ISBN values : " + 
 				   data.stream().map(studio -> studio.getStudioTheatreMap())
 				   .filter(key -> key.containsKey("Java"))
 				   .flatMap(val -> val.values().stream().limit(5)));
       		
       		
		  
		System.out.println(data.stream().map(x -> x.getBooktitle()).filter(m -> m.contains("Java")).count());
		
		
	}

}
