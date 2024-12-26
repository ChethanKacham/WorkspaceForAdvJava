package week2;

public class IndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		try {
			for(int i=0;i<=a.length;i++)
				System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Continue to here");

	}

}
