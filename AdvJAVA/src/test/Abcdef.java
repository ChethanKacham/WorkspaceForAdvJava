package test;

public enum Abcdef {
	
	ADD {
		public double apply(double a, double b) {
			return a+b;
		}		
	}, 
	MINUS {
		public double apply(double a, double b) {
			return a-b;
		}	
	}, 
	TIMES {
		public double apply(double a, double b) {
			return a*b;
		}	
	}, 
	DIVIDE {
		public double apply(double a, double b) {
			return a/b;
		}
	};
	public abstract double apply(double a, double b);
	
	
	public static void main(String args[]) {
		double a = 10, b = 5;
		
		for(Abcdef i : Abcdef.values())
			System.out.printf("%f %s %f = %f\n", a, i, b, i.apply(a,b));
	}
	

}
