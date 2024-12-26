package week5;

import java.util.Iterator;

class Data<T> implements Iterable<T>{
	T[] data;
	int numElements = 0;
	int idx = 0, curIdx = 0;
	int size = 0;
	
	Data(int size){
		this.size = size;
		data = (T[]) new Object [size];
	}
	
	void add(T element) {
		if(numElements < size) {
			data[idx++] = element;
			numElements++;
		}
	}
	
	public Iterator<T> iterator(){
		// must include next(), hasNext() and remove()
		Iterator<T> itr = new Iterator<T>() {
			
			public T next() {
				return data[curIdx++];
			}
			
			public boolean hasNext() {
				return (curIdx < numElements ? true : false);
			}
			
			public void remove() {
				
			}
		};
		
		return itr;
	}
	
	
}

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Data<Integer> num = new Data<Integer>(n);
		
		for(int i=0;i<n;i++)
			num.add(i);
		
		Iterator<Integer> itr = num.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}
