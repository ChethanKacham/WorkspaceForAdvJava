package week4;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		
		linkedSet.add("A");
		linkedSet.add("D");
		linkedSet.add("B");
		linkedSet.add("C");
		
		linkedSet.add("A");
		linkedSet.add("E");
		
		System.out.println(linkedSet);
		System.out.println("Does linkedSet contains A? " + linkedSet.contains("A"));
		
		linkedSet.remove("A");
		System.out.println("After removing do linkedSet contains A? " + linkedSet.contains("A"));
		
		Iterator<String> itr = linkedSet.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();

	}

}
