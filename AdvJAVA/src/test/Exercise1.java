package test;

interface Num {
	public void print(int n);
}

public class Exercise1 {
	// ADD your code here
	static Num odd = new Num() {
		public void print(int n) {
			for(int i=0 ; i<n ; i++) {
				if (i%2 != 0)
					System.out.print(i + " ");
			}
			System.out.print("\n");
		}
	};
	
	
	static Num even = new Num() {
		public void print(int n) {
			for(int i=0 ; i<n ; i++) {
				if (i%2 == 0)
					System.out.print(i + " ");
			}
		}
	};
	
	public static void main(String[] args) {
		odd.print(10);
		even.print(10);
	}
}
