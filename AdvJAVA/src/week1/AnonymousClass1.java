package week1;

class MyClass{
	
	void print() {
		System.out.println("I am outer class");
	}
	
	void doSomething() {
		System.out.println("Doing Something");
	}
}

class OtherClass{
	MyClass obj = new MyClass() {
		void print() {
			System.out.println("I am anonymous class");
		}
	};
}
public class AnonymousClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OtherClass o = new OtherClass();
		o.obj.print();
		o.obj.doSomething();
	}

}
