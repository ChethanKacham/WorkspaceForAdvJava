package exercises;

class Item<T>{
	T[] data;

	
	double sum(T[] data) {
		this.data = data;
		double ans =0;
		for(int i =0; i<data.length; i++)
			ans += Double.parseDouble(data[i].toString());
		return ans;
		}
	}

public class GenericApp {
	
	static <T> void Print(T[] data) {
		for(T ele: data)
			System.out.println(ele+ " ");
		System.out.println();
	}
	
	
//	static <T1, T2> void Add(T1[] data1, T2[] data2) {
//		for(int i=0;i<data1.length;i++) {
//			double ans = Double.parseDouble(data1[i].toString()) + Double.parseDouble(data2[i].toString());
//			System.out.println(ans+ " ");
//		}
//		System.out.println();
//	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 1.2, 1.3, 1.4};
		// ADD your code here
		
		Item<Integer> data1 = new Item<Integer>();
		Item<Double> data2 = new Item<Double>();
		
		//Add(intArray, doubleArray);
		
		System.out.println(data1.sum(intArray));
		System.out.println(data2.sum(doubleArray));
}
}
