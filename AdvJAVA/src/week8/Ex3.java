package week8;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data = new ArrayList<String>();
		data.add("AAAAAA");
		data.add("BBB");
		data.add("CCCC");
		data.add("DDDDDDD");
		
		data.stream().filter(str -> str.length() < 6).forEach(System.out::println);
		
		long cnt = data.stream().filter(str -> str.length() < 6).count();
		System.out.println(cnt);
	}

}
