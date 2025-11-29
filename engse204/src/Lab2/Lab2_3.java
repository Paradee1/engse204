package Lab2;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		
		System.out.print("จำนวนนักเรียนที่ลงทะเบียน : ");
		int N=st.nextInt();
		
		st.nextLine();
		
		for(int i=0;i<N;i++) {
			System.out.print("รหัสนักศึกษา : ");
			String id=st.nextLine();
			System.out.print("ชื่อ-นามสกุล : ");
			String name=st.nextLine();
			
			Student ae = new Student(id,name);
		}
		System.out.println(Student.studentCout);
		st.close();
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

