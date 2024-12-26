package test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex4dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("Mary");
		ls.add("Johnson");
		ls.add("Peter");
		ls.add("Sarah");
		ls.add("Kate");

		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
