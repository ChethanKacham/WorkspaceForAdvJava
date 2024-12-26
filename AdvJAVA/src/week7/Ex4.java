package week7;

interface Executable{
	public void execute();
}

class Runner {
	void run(Executable e) {
		System.out.println("Running");
		e.execute();
	}
}

public class Ex4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner = new Runner();
//		runner.run(new Executable() {
//			public void execute() {
//				System.out.println("Hello World");
//			}
//		});
		runner.run(() -> System.out.println("Hello World"));
	}

}
