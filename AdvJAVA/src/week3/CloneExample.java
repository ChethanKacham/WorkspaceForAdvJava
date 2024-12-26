package week3;

import java.util.Arrays;

class Data implements Cloneable {
	
	int[] data;
	int size;

	Data(int[] vals) {
		data = vals;
		size = data.length;
	}

	Data(Data obj) {
		size= obj.size;
		data = new int[size];
		for(int i = 0; i<size; i++) {
			data[i] = obj.data[i];
		}
	}
	@Override
	public String toString() {
		return "Size=" + size + " : " + Arrays.toString(data);

	}

	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		
		Data obj = (Data) super.clone();
		obj.data = new int[size];
		for(int i = 0; i<size ;i++) 
			obj.data[i] = this.data[i];
		return obj;
		
	}

}

public class CloneExample {

	public static void main(String[] args) {
		int[] vals = { 1, 2, 3, 4, 5 };
		Data data1 = new Data(vals);

		System.out.println(data1);

		try {

			Data data2 = (Data) data1.clone();
			vals[0] = 9;
			System.out.println(data2);

		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		Data data3 = new Data(data1);
		vals[0] = 99;
		System.out.println(data3);
	}

}
