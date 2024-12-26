package week7;

@FunctionalInterface
interface MyFunctionalInterface {
	public String sayHello();
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyFunctionalInterface msg = () -> {
//			return "Hello World";
//		};
		
		MyFunctionalInterface msg = () -> "Hello World";
		
		System.out.println(msg.sayHello());

	}

}