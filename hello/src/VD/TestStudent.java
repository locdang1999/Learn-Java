package VD;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<Student>();
		Student std = new Student();
		
		std.setTen("Johnny");
		stdList.add(std);
		
		std = new Student();
		
		std.setTen("Roger");
		
		
		stdList.add(std);
		for (Student student : stdList) {
			System.out.println(student.getTen());
		}
	}
}
