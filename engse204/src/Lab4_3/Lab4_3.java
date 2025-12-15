package Lab4_3;

import java.util.Scanner;

public class Lab4_3 {

	public static void main(String[] args) {
		Scanner at = new Scanner(System.in);
		
		int N = at.nextInt();
		at.nextLine();
		
		if(N == 1) {
			Player py = new Player();
			py.displayProfile();
		}
		else if(N == 2) {
			String Username = at.nextLine();
			int Level = at.nextInt();
			
			Player py = new Player(Username, Level);
			py.displayProfile();
		}
		
		at.close();

	}

}

class Player {
	private String username;
	private int level;
	
	public Player() {
		this.username = "Guest";
		this.level = 1;
	}
	
	public Player(String username, int level) {
		this.username = username;
		this.level = level;
	}
	
	public void displayProfile() {
		System.out.println("User: " + username + ", Level: " + level);
	}
}