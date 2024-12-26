package exercises;

class Item2<T>{
	T[] data;
	
	double sum(T[] data){
		this.data = data;
		double sum = 0;
		
		for(int i=0;i<data.length;i++)
			sum += Double.parseDouble(data[i].toString()); 
		return sum;
	}
	
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 1.2, 1.3, 1.4};
		
		Item2<Integer> data1 = new Item2<Integer>();
		Item2<Double> data2 = new Item2<Double>();
		
		System.out.println(data1.sum(intArray));
		System.out.println(data2.sum(doubleArray));
		
		

	}

}