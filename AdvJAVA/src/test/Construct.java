package test;

public class Construct {	
	int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Construct(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Construct [x=" + x + ", y=" + y + "]";
	}
	
	void show() {
		System.out.println("x = " + x + ", y = " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct abc = new Construct(4, 5);
		abc.show();
		System.out.println(abc);

	}

}
