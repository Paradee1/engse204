package Lab3_1;

import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] rgs) {
		Scanner ip = new Scanner(System.in);
		
		String name = ip.nextLine();
		
		User us = new User(name);
		
		System.out.println(us.getUsername());
		
	}

}

class User {
	private String username; 
	
	public User(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
}