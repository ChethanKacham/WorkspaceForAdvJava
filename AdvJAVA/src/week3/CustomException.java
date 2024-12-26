package week3;

class MyCircle{
	int r;
	public MyCircle(int r) throws InvalidRadiusException {
		setRadius(r);
	}
	void setRadius(int r) throws InvalidRadiusException{
		if(r>0) this.r =r;
		else throw new InvalidRadiusException(r);
	}
}

class InvalidRadiusException extends Exception{
	int r;
	public InvalidRadiusException(int r) {
		super("Invalid radius "+ r);
		this.r =r;
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new MyCircle(-5);
		}
		catch(InvalidRadiusException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Continue to here");
		}

	}

}
