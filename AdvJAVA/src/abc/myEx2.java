package abc;

import java.util.stream.Stream;

public class myEx2 {
	
	static void countWord(String text, String searcWord) {
		
		String[] word = text.split(" ");
		
       System.out.println(Stream.of(word).filter(x-> x.equals(searcWord)).count());		
		
	}

	public static void main(String[] args) {
		
		String text = "data is important for data sceince because data can be analyzed";
		countWord(text, "data");

	}

}

//using lambdas and streams to find count of particular word in a sentence 