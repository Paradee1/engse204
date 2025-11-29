package engse204;

import java.util.Scanner;

public class lab2_1 {

	public static void main(String[] rgs) {
		Scanner se=new Scanner(System.in);
		
		String id = se.nextLine();
		String name = se.nextLine();
		
		Student st = new Student(id, name);
		
		System.out.println(st.studentId);
		System.out.println(st.name);

	}

}
class Student {
		public String studentId;
		public String name;
		
		public Student(String studentId, String name) {
			this.studentId = studentId;
			this.name = name;
	}

}