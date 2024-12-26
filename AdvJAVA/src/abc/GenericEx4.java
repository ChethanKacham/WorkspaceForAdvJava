package abc;

class MyData<T>{
	
	private T[] data;

	public MyData(T[] data) {
		
		 this.data =data;
	
	}	
	
	public T[] get() {
		
		return this.data;
	}
}
public class GenericEx4 {
	
	private static <T1,T2> void combine(MyData<T1> data1,MyData<T2> data2) {
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
		// TODO Auto-generated method stub

		Integer[] intArray = {0,1,2,3,4,5,6};
		String[] strArray = {"Bob", "Peter", "Kate", "John", "Mary", "Sarah"};
		
		MyData<Integer> data1 = new MyData<Integer>(intArray);
		MyData<String> data2 = new MyData<String>(strArray);
		
		combine(data1, data2);
		System.out.println();
		combine(data2,data1);
	}

}

