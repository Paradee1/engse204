package Lab4_1;

import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//รับโหมด 1 หรือ 2
		int mode = in.nextInt();
		in.nextLine();
		
		if(mode == 1) {
			
			//รับชื่อเรื่อง
			String title = in.nextLine();
			
			Book bk = new Book(title);
			bk.displayInfo();
		}
		else if(mode == 2) {
			
			//รับชื่อเรื่องและผู้แต่ง
			String title = in.nextLine();
			String author = in.nextLine();
			
			Book bk = new Book(title, author);
			bk.displayInfo();
		}
		
		in.close();
	}

}

class Book {
	private String title;
	private String author;
	
	// Constructor 
	public Book(String title) {
		this.title = title;
		this.author = "Unknown";
	}
	
	// Constructor 
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("----------------------------------------------------");
		System.out.println("Title: " + title + ", Author: " + author);
	}
}