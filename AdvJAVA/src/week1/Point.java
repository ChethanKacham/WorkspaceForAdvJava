package week1;

public class Point {
	
	int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x, y are " + x + " and " + y;
	}
	
	@Override
	public boolean equals(Object o) {
		Point p = (Point) o;
		return x == p.x && y == p.y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1 = new Point(4,6);
		Point pt2 = new Point(5,6);
		Point pt3 = new Point(4,6);
		
		System.out.println(pt1);
		System.out.println(pt2);
		System.out.println(pt3);
		
		if(pt1.equals(pt3))
			System.out.println("Objects are equal");
		else
			System.out.println("Objects are not equal");

	}

}
