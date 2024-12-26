package week1;

interface Iterator{
	boolean hasNext();
	int next();	
}

public class AnonymousClass2 {
	
	int total;
	
	public AnonymousClass2(int total) {
		this.total = total;
	}
	
	Iterator iter = new Iterator() {
		int idx = 0;
		public boolean hasNext() {
			return idx < total ? true : false;
		}
		public int next() {
			return ++idx;
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousClass2 obj = new AnonymousClass2(10);
		
		while(obj.iter.hasNext())
			System.out.println(obj.iter.next());
		
	}

}
