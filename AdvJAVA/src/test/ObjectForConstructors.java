package test;

public class ObjectForConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		
	}

}

class A{
	public A() {
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		System.out.println("B");
	}
}