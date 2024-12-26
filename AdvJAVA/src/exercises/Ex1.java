package exercises;

interface Num{
	public void print(int n);
}

public class Ex1 {
	
	static Num odd = new Num() {
		
		public void print(int n) {
			for(int i=0; i<n;i++) {
				if(i%2!=0)
					System.out.print(i + " ");
			}
			System.out.println("");
				
		}
	};
	
	static Num even = new Num() {
		
		public void print(int n) {
			for(int i=0; i<n;i++) {
				if(i%2==0)
					System.out.print(i + " ");
			}
			System.out.println("");
				
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		odd.print(10);
		even.print(10);

	}

}
