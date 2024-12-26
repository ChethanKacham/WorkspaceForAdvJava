package test;


class Item<T>{
	T[] data;
	double sum = 0;
	
	double sum(T[] data) {
		this.data = data;
		double ans =0;
		for(int i =0; i<data.length; i++)
			ans += Double.parseDouble(data[i].toString());
		return ans;
		}
}

public class GenericApp1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 1.2, 1.3, 1.4 };
		// ADD your code here
		Item<Integer> data1 = new Item<Integer>() ;
		Item<Double> data2 = new Item<Double>() ;
		
		System.out.println(data1.sum(intArray));
		System.out.println(data2.sum(doubleArray));
	}
}