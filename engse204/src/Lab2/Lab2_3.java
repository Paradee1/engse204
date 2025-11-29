package Lab2;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] rgs) {
		Scanner an=new Scanner(System.in);
		
		int N=an.nextInt();
		
		an.nextLine();
		
		for(int i=0;i<N;i++) {
			String id=an.nextLine();
			String name=an.nextLine();
			
			Studenttwo ae = new Studenttwo(id,name);
		}
		System.out.println(Studenttwo.studentCout);
		an.close();
	}

}

class Studenttwo {
	private String studentId;
	private String name;
	
	public static int studentCout = 0;
	
	public Studenttwo(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;

		Studenttwo.studentCout++;
	}
	
}

