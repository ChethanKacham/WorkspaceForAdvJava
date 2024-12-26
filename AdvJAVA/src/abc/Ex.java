package abc;

public class Ex {
	
	private static void countWord(String text, String searchWord) {
		
		int count = 0;
		
		String words[] = text.split(" ");
		
		for(int i =0; i< words.length; i++) {
			if(words[i].equals(searchWord))
				count ++;
		}
		System.out.println(count);
		
	}


	public static void main(String[] args) {
		
		String text = "data is important for data science because data can be analyzed";
		countWord(text, "data");
		countWord(text,"science");
	}

	
}

// code to search occurence of a word in a senetence