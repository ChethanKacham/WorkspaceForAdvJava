package week1;

interface CarFullService{
	void carService();
}

class CarAFullService implements CarFullService{
	public void carService() {
		System.out.println("Car A Service");
	}
}

class CarBFullService implements CarFullService{
	public void carService() {
		System.out.println("Car B Service");
	}
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFullService car = new CarAFullService();
		car.carService();

	}

}
