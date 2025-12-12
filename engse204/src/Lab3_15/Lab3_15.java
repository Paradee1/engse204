package Lab3_15;

import java.util.Scanner;

public class Lab3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class User {
	private String username;
	private int failedAttempts = 0;
	private boolean isLocked = false;
	private static int maxAttempts = 3;
	
	public User(String username) {
		this.username = username;
		this.isLocked = false;
		
	}
	
	public static void setPolicy(int max) {
		if(max > 0) {
			maxAttempts = max;
			System.out.println("Policy updated.");
		}
		else {
			System.out.println("Invalid policy.");
		}
	}
	
	public String getUsername() {
		return username;
	}
	
	public boolean isLocked() {
		return isLocked;
	}
	
	public int getFailedAttempts() {
		return failedAttempts;
	}
	
	
}