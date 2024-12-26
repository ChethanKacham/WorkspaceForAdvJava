package week7;

import java.util.function.DoubleBinaryOperator;

public enum EnumEx {
	PLUS("+", (x,y) -> x+y),
	MINUS("-", (x,y) -> x-y),
	TIMES("*", (x,y) -> x*y),
	DIVIDE("/", (x,y) -> x/y);
	
	String symbol;
	DoubleBinaryOperator op;
	
	EnumEx(String symbol, DoubleBinaryOperator op){
		this.symbol = symbol;
		this.op = op;
	}
	
	@Override
	public String toString() { return symbol;}
	
	public double apply(double x, double y) {
		return op.applyAsDouble(x,y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5;
		double y = 6;
		
		for(EnumEx op : EnumEx.values())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x,y));

	}

}