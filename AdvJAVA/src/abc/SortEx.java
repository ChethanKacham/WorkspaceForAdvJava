package abc;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SortData {
    String course;
    String name;
    String Grade;
    SortData(String course,String name,String Grade) {
        this.name = name;
        this.course = course;
        this.Grade=Grade;
    }

    @Override
    public String toString() {
        return course+" "+name+" "+Grade;
    }
}
public class SortEx {
	
	static int i=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<SortData> data = new ArrayList<>();
		Stream<String> lines =Files.lines(
				Paths.get(args[0]).toAbsolutePath());
		
		lines.map(s->{
			String[] strs= s.split(",");
			data.add(new SortData(strs[0],strs[1],strs[2]));
			i++;
			return s;
		}).collect(Collectors.toList());
		
		 Comparator<SortData> cmp = new Comparator<SortData>() {
	            @Override
	            public int compare(SortData p1, SortData p2) {
	            	int coursecomp=p1.course.compareTo(p2.course);
	                int namecomp = p1.name.compareTo(p2.name);
	                int Gradecomp = p1.Grade.compareTo(p2.Grade);
	                if(coursecomp==0 && Gradecomp==0)
	                	return namecomp;
	                else if (coursecomp==0)
	                	return Gradecomp;
	               return  coursecomp;
	            }
	        };
	        
//	        Collections.sort(data, cmp);
//	        
//	       // System.out.println("\n After Sorting .....\n");
//	        for(SortData p: data)
//	            System.out.println(p);
	        
	        data.stream().sorted(cmp).forEach(System.out :: println);

	}

}
