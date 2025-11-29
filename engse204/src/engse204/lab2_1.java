package engse204;

import java.util.Scanner;

public class lab2_1 {
	
	public static class Student {
		private String studentId;
		private String name;
		
		public Student(String studentId, String name) {
			this.studentId = studentId;
			this.name = name;
	}
		public void display() {
			System.out.println(studentId);
			System.out.println(name);
		}
}
	
	public static void main(String[] rgs) {
		Scanner se=new Scanner(System.in);
		
		String id = se.nextLine();
		String name = se.nextLine();
		
		Student st = new Student(id, name);
		
		st.display();

	}

}
