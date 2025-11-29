package Lab2;

import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		Scanner se=new Scanner(System.in);
		
		String id = se.nextLine();
		String name = se.nextLine();
		
		Student st = new Student(id, name);
		
		st.displayInfo();
	}

}
class Student {
		public String studentId;
		public String name;
		
		public Student(String studentId, String name) {
			this.studentId = studentId;
			this.name = name;
	}
		public void displayInfo() {
			System.out.println(studentId);
			System.out.println(name);

	}

}
