package week7;

interface StringConcat {
	public String apply(String x, String y, String z);
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcat s = (str1, str2, str3) -> str1 + str2 + str3;
		System.out.println(s.apply("Hello " , "World ", "- Chethan:)"));
	}

}
