package Lab3_15;

import java.util.Scanner;

public class Lab3_15 {

	public static void main(String[] args) {
		Scanner df = new Scanner(System.in);
		
		String name = df.nextLine();
		User nm = new User(name);
		
		int N = df.nextInt();
		df.nextLine();
		
		for(int i = 0 ; i < N ; i++) {
			String order = df.nextLine();
			
			if(order.equals("SET_POLICY")) {
				int newmax = df.nextInt();
				df.nextLine();
				User.setPolicy(newmax);
			}
			else if(order.equals("LOGIN")) {
				String pass = df.nextLine();

				nm.login(pass);
			}
		}

	}

}

class User {
	private String username = null;
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
		return username ;
	}
	
	public boolean isLocked() {
		return isLocked;
	}
	
	public int getFailedAttempts() {
		return failedAttempts;
	}
	
	public void login(String password) {
		if(isLocked == true) {
			System.out.println("Account is locked.");
		}
		else if(isLocked == false) {
			
			if(password.equals("pass123")) {
				failedAttempts = 0;
				System.out.println("Login successful.");
			}
			else {
				failedAttempts++;
				if(failedAttempts >= maxAttempts) {
					isLocked = true;
					System.out.println("Login failed. Account locked..");
				}
				else {
					int left = maxAttempts - failedAttempts;
					System.out.println("Login failed. [" + left +"] attempts left.");
				}
			}
		}
	}
}