package week5;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sset = new TreeSet<String>();
		
		sset.add("C");
		sset.add("B");
		sset.add("A");
		sset.add("D");
		
		sset.add("A");
		sset.add("E");
		
		System.out.println(sset);
		
		sset.remove("A");
		
		System.out.println(sset);
		
		Iterator<String> itr = sset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("---------------------");
		
		SortedSet<String> headset = sset.headSet("D");
		System.out.println(headset);
		
		SortedSet<String> tailset = sset.tailSet("D");
		System.out.println(tailset);
		
		SortedSet<String> subset = sset.subSet("B", "D");
		System.out.println(subset);
		

	}

}
