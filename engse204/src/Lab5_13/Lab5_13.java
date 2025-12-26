package Lab5_13;

import java.util.Scanner;

public class Lab5_13 {

	public static void main(String[] args) {
		Scanner qw = new Scanner(System.in);
		
		String name1 = qw.nextLine();
		int projects1 = qw.nextInt();
		qw.nextLine();
		
		String name2 = qw.nextLine();
		int projects2 = qw.nextInt();
		qw.nextLine();
		
		String adminKey = qw.nextLine();
		
		User u1 = new User("Guest");
		Developer d1 =new Developer(name1,projects1);
		Admin a1 = new Admin(name2, projects2, adminKey);
		
		User[] user = { u1, d1, a1 };
		
			int totalClearance = 0;
		for(User u: user) {
			totalClearance += u.getClearanceLevel();
		}
		
		for(User u: user) {
			if(u instanceof Admin) {
				System.out.println(((Admin) u).getAdminKey());
			}
		}
		
		System.out.println(totalClearance);

		qw.close();
	}

}

class User {
	protected String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public int getClearanceLevel() {
		return 1;
	}
}

class Developer extends User {
	protected int projects;
	
	public Developer(String name, int projects) {
		super(name);
		this.projects = projects;
	}
	
	@Override
	public int getClearanceLevel() {
		return 2;
	}
}

class Admin extends Developer {
	protected String adminKey;
	
	public Admin(String name, int projects, String adminKey) {
		super(name, projects);
		this.adminKey = adminKey;
	}
	
	@Override
	public int getClearanceLevel() {
		return 3;
	}
	
	public String getAdminKey() {
		return adminKey;
	}
}