package week4;

class MyStack<T>{
	T[] data;
	int size = 10;
	int idx = 0;
	
	MyStack(){
		data = (T[])new Object[size];
	}
	
	void push(T item) {
		if(idx >= size) {
			System.out.println("Stack Overflow");
			return;
		}
		else {
			data[idx++] = item;
		}
	}
	
	T pop() {
		if(idx == 0) {
			System.out.println("Stack Underflow");
			return null;
		}
		else 
			return data[--idx];
	}
	
}

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<Integer> intStack = new MyStack<Integer>();
		MyStack<Double> doubleStack = new MyStack<Double>();
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		intStack.push(4);
		
		doubleStack.push(1.0);
		doubleStack.push(2.0);
		doubleStack.push(3.0);
		System.out.println(doubleStack.pop());
		System.out.println(doubleStack.pop());
		doubleStack.push(4.0);
	}

}
