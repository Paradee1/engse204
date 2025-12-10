package Lab3_9;

import java.util.Scanner;

public class Lab3_9 {

	public static void main(String[] args) {
		Scanner us = new Scanner(System.in);
		
		int minLength1 = us.nextInt();
		us.nextLine();
		
		String user1_name = us.nextLine();
		String user1_pass = us.nextLine();
		
		String user2_name = us.nextLine();
		String user2_pass = us.nextLine();
		
		int minLength2 = us.nextInt();
		us.nextLine();
		
		String user2_newPass = us.nextLine();
		
		User.setMinLength(minLength1);
		
		User user1 = new User(user1_name, user1_pass);
		User user2 = new User(user2_name, user2_pass);
		
		User.setMinLength(minLength2);
		
		user2.setPassword(user2_newPass);
		
		System.out.println(user1.getPassword());
		System.out.println(user2.getPassword());
		
	}

}

class User {
	private String username;
	private String password;
	
	private static int minPasswordLength = 8;
	
	public static void setMinLength(int Length) {
		if(Length < 4) {
			System.out.println("Invalid length.");
		}
		else if(Length >= 4) {
			minPasswordLength = Length;
			System.out.println("New min length set to " + Length);
		}
	}
	
	public static int getMinLength() {
		return minPasswordLength;
	}
	
	public User(String username, String password) {
		this.username = username;
		
		if(password.length() >= minPasswordLength) {
			this.password = password;
			System.out.println("Creation successful.");
		}
		else {
			this.password = "Invalid";
			System.out.println("Creation Failed.");
		}
	}
	
	public void setPassword(String newPassword) {
		if(newPassword.length() >= minPasswordLength) {
			password = newPassword ;
			System.out.println("Update successful.");
		}
		else {
			System.out.println("Update Failed.");
		}
	}
	
	public String getPassword() {
		return password;
	}
	
	
}