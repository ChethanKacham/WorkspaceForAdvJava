package exercises;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		
		linkedset.add("Mary");
        linkedset.add("Johnson");
        linkedset.add("Peter");
        linkedset.add("Sarah");
        linkedset.add("Kate");
        
        //System.out.println(linkedset);
        
//        for(String itr : linkedset)
//        	System.out.println(itr);
        
        Iterator itr = linkedset.iterator();
        while(itr.hasNext())
        	System.out.println(itr.next());
   

	}

}
