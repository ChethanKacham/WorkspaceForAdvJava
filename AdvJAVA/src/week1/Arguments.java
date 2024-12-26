package week1;

public class Arguments {
	
	static void foo(int ... a) {
		
		System.out.println("The length of arguments is " + a.length);
		
		int sum = 0;
		for(int i : a)
			sum += i;
		
		System.out.println("Sum is " + sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo(100);
		foo(1,2,3,4,5);
		foo(1,2,3);
		foo();

	}

}
