package exercises;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lSet = new LinkedHashSet<String>();
		
		lSet.add("Mary");
		lSet.add("Johnson");
		lSet.add("Peter");
		lSet.add("Sarah");
		lSet.add("Kate");
		
		Iterator<String> itr = lSet.iterator();
		while(itr.hasNext()) 
			System.out.print(itr.next()+ " ");
		System.out.println();

	}

}
