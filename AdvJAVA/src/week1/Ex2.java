package week1;

abstract class CarService{
	
	void runService() {
		System.out.println("Run service");
	}
	
	abstract void prepareService();
	
	void service() {
		runService();
		prepareService();
	}
}

class CarAService extends CarService{
	void prepareService() {
		System.out.println("Car A Service");
	}
}

class CarBService extends CarService{
	void prepareService() {
		System.out.println("Car B Service");
	}
}

public class Ex2{
	public static void main(String[] args) {
		CarService car = new CarBService();
		car.service();
	}
}