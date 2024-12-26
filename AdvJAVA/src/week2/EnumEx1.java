package week2;

enum Level{
	LOW, MEDIUM, HIGH;
	
	Level(){
		System.out.println("Constructor called for " + this.toString());
	}
}

public class EnumEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Level i: Level.values())
			System.out.println(i + " at index " + i.ordinal());
		Level val = Level.MEDIUM;
		switch(val) {
			case LOW:
				System.out.println("It is low");
				break;
			case MEDIUM: 
				System.out.println("It is medium");
				break;
			case HIGH: 
				System.out.println("It is high");
				break;
			default:
				System.out.println("Oops..!!");
				break;
		}
	}

}

