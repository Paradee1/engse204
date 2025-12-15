package Lab4_1;

import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int mode = in.nextInt();
		in.nextLine();
		
		if(mode == 1) {
			String title = in.nextLine();
			Book bk = new Book(title);
			
			bk.displayInfo();
		}
		else if(mode == 2) {
			String title = in.nextLine();
			String author = in.nextLine();
			
			Book bk = new Book(title, author);
			bk.displayInfo();
		}
		
		
	}

}

class Book {
	private String title;
	private String author;
	
	public Book(String title) {
		this.title = title;
		this.author = "Unknown";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}