package week1;

class Num{
	public int instanceNumber = 0;
	public static int classNumber = 0;
}

public class Test {
	
	void foo1() {
		System.out.println("Foo1");
	}
	
	static void foo2() {
		System.out.println("Foo2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.foo1();
		Test.foo2();
		
		System.out.println(++Num.classNumber);
		
		Num n = new Num();
		
		System.out.println(++n.instanceNumber);
		System.out.println(++n.classNumber);

	}

}
