package exercises;

public enum Operation {
	PLUS{
		public double apply(double a, double b) {
			return a+b;
		}
	}, 
	MINUS{
		public double apply(double a, double b) {
			return a-b;
		}
	}, 
	TIMES{
		public double apply(double a, double b) {
			return a*b;
		}
	}, 
	DIVIDE{
		public double apply(double a, double b) {
			return a/b;
		}
	};
	
	public abstract double apply(double a, double b);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=10;
		double b=5;
		
		for(Operation op : Operation.values())
			System.out.printf("%f %s %f = %f\n", a, op, b, op.apply(a,b));

	}

}
