package week2;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		
		try {
			if (str.equals("abcd"))
			//if("abcd".equals(str))	
				System.out.println("They are same");
			else
				System.out.println("They are not same");
		}
		catch(RuntimeException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Continue to here");
		}

	}

}
