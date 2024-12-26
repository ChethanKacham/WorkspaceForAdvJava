package week7;

interface MyFunctionalInterface1 {
	public int incrementByFive(int x);
}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface1 f = (num) -> num+5;
		
		System.out.println(f.incrementByFive(10));
	}

}
