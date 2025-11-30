package Lab2_3;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] rgs) {
		Scanner an=new Scanner(System.in);
		
		int N=an.nextInt();
		
		an.nextLine();
		
		for(int i=0;i<N;i++) {
			String id=an.nextLine();
			String name=an.nextLine();
			
			Student ae = new Student(id,name);
		}
		System.out.println(Student.studentCout);
		an.close();


	}

}
	
	class Student {
		private String studentId;
		private String name;
		
		public static int studentCout = 0;
		
		public Student(String studentId, String name) {
			this.studentId = studentId;
			this.name = name;

			Student.studentCout++;
		}
		
	}

