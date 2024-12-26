package test;

class Abcd {
	void print() {
		System.out.println("Print");
	}
}

class Bcd extends Abcd {
	void eat() {
		System.out.println("Eating");
		print();
	}
}


public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bcd abc = new Bcd();
		abc.eat();

	}

}
