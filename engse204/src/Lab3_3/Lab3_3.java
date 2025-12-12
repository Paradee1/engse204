package Lab3_3;

import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] rgs) {
		Scanner ps = new Scanner(System.in);
		
		String StartPass = ps.nextLine();
		String NewPass = ps.nextLine();
		
		User pt = new User(StartPass);
		
		System.out.println("-------------------------------------");
		
		pt.setPassword(NewPass);
		System.out.println(pt.getPassword());

	}

}

class User {
	private String password ;
	
	public User(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String newPassword) {
		if(newPassword.length() >= 8) {
			this.password = newPassword ;
			System.out.println( "Password update." );
		}
		else {
			System.out.println("Password is too short.");
		}
	}
}