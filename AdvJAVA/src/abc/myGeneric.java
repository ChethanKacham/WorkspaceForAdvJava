package abc;

class Generic<T> {

	private T[] data;

	public Generic(T[] data) {
		
		 this.data =data;
	
	}	
	
	public T[] get() {
		
		return this.data;
	
}
}

public class myGeneric {
	
	private static <T1,T2> void combine(Generic<T1> data1,Generic<T2> data2) {
		 for(int i=0; i<data1.get().length; i++) {
			 if( i%2 !=0)
				 System.out.println(data1.get()[i]);
		 }
		 
		 for(int i=0; i<data2.get().length; i++) {
			 if( i%2 !=0)
				 System.out.println(data2.get()[i]);
		 }
	}

	public static void main(String[] args) {
		Integer [] intArray = {0,1,2,3,4,5,6};
		String [] str = {"abc", "bcd" ,"cde"};
		
		Generic<Integer> data1 = new Generic<Integer>(intArray);
		Generic<String> data2 = new Generic<String>(str);
		
		combine(data1, data2);
		System.out.println();
		combine(data2, data1);
		
	}
}
