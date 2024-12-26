package week4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hSet = new HashSet<String>();
		
		hSet.add("A");
		hSet.add("D");
		hSet.add("B");
		hSet.add("C");
		hSet.add("123");
		
		System.out.println(hSet);
		
		hSet.remove("A");
		
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+ " ");
		System.out.println();

	}

}
