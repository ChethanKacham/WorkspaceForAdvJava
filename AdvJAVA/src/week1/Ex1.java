package week1;

class Car{
	void buildEngine() {
		System.out.println("V4 Engine..!!");
	}
}

class Car2Door extends Car{
	void build() {
		System.out.println("2 Door..!!");
		buildEngine();
	}
}

class Car4Door extends Car{
	void build() {
		System.out.println("4 Door..!!");
		buildEngine();
	}
}


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2Door car = new Car2Door();
		car.build();

	}

}
