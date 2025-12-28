package Lab5_13;

import java.util.Scanner;

public class Lab5_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// รับInputสำหรับ User
		String name1 = qw.nextLine();
		int projects1 = qw.nextInt();
		qw.nextLine();
		
		// รับInputสำหรับ Developer
		String name2 = qw.nextLine();
		int projects2 = qw.nextInt();
		qw.nextLine();
		
		// รับInputสำหรับ Admin
		String adminKey = qw.nextLine();
		
		User u1 = new User("Guest");
		Developer dev =new Developer(name1,projects1);
		Admin admin = new Admin(name2, projects2, adminKey);
		
		User[] user = { u1, dev, admin };
		
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

		scanner.close();
	}

}

//Superclass
class User {
	
	// Attributes
	protected String name;
	
	// Constructor
	public User(String name) {
		this.name = name;
	}
	
	// Methods
	public int getClearanceLevel() {
		return 1;
	}
}

//Subclass
class Developer extends User {
	
	// Attributes
	protected int projects;
	
	// Constructor
	public Developer(String name, int projects) {
		super(name);
		this.projects = projects;
	}
	
	// Methods
	@Override
	public int getClearanceLevel() {
		return 2;
	}
}

//Subclass
class Admin extends Developer {
	
	// Attributes
	protected String adminKey;
	
	// Constructor
	public Admin(String name, int projects, String adminKey) {
		super(name, projects);
		this.adminKey = adminKey;
	}
	
	// Methods
	@Override
	public int getClearanceLevel() {
		return 3;
	}
	
	// Methods
	public String getAdminKey() {
		return adminKey;
	}
}