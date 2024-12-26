package week3;

class Item2<T> {
	T[] data;
	
	void set(T[] vals) {
		data = (T[]) new Object [vals.length];
		for(int i=0; i<data.length; i++) {
			data[i] = vals[i];
		}
	}
	
	void print () {
		for(T ele : data) 
			System.out.print(ele + " ");
			System.out.println();
		
	}
}
public class GenericEx2 {

	public static void main(String[] args) {
		Integer [] intArray = {1,2,3};
		String [] str = {"abc", "bcd" ,"cde"};

		Item2<Integer> data1 = new Item2<Integer>() ;
		Item2<String> data2 = new Item2<String>() ;
		
		
		data1.set(intArray);
		data2.set(str);
		
		data1.print();
		data2.print();
		
	}

}
