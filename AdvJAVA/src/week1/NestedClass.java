package week1;

class OuterClass{
	private int x = 99;
	void print() {
		System.out.println("X is " + x);
		
		InnerClass i = new InnerClass();
		i.y = 100;
		System.out.println("Y is " + i.y);
	}
	
	class InnerClass{
		private int y = 1;
		void print() {
			System.out.println("X is " + x);
		}
	}
}

public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass o = new OuterClass();
		OuterClass.InnerClass iobj = o.new InnerClass();
		//iobj.print();
		o.print();
	}

}
