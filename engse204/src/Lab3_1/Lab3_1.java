package Lab3_1;

import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] rgs) {
		
		Scanner ip = new Scanner(System.in);
		
		//รับชื่อผู้ใช้
		String name = ip.nextLine();
		
		// สร้างออบเจ็กต์ User
		User us = new User(name);
		
		System.out.println("---------------------------");
		
		// แสดงชื่อผู้ใช้ 
		System.out.println(us.getUsername());
		
	}

}

class User {
	// เก็บชื่อผู้ใช้
	private String username; 
	
	// กำหนดค่าusernameตอนสร้างออบเจ็กต์
	public User(String username) {
		this.username = username;
	}
	
	// คืนค่าชื่อผู้ใช้
	public String getUsername() {
		return username;
	}
}