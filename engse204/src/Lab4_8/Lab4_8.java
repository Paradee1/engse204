package Lab4_8;

import java.util.Scanner;

public class Lab4_8 {

	public static void main(String[] args) {
		Scanner gg = new Scanner(System.in);
		
		// รับโหมด 1,2,3
		int mode = gg.nextInt();
		gg.nextLine();
		
		// รีบชื่อเรื่องอย่างเดียว
		if(mode == 1) {
			String name = gg.nextLine();
			
			Movie movie = new Movie(name);
			movie.displayDrtails();
		}
		// รับชื่อเรื่องแลเผู้กำกับ
		else if(mode == 2) {
			String name = gg.nextLine();
			String direc = gg.nextLine();
			
			Movie movie = new Movie(name, direc);
			movie.displayDrtails();
		}
		// รับชื่อเรื่อง ผู้กำกับ และเรทติ้ง 
		else if(mode == 3) {
			String name = gg.nextLine();
			String direc = gg.nextLine();
			double rat = gg.nextDouble();
			
			Movie movie = new Movie(name, direc, rat);
			movie.displayDrtails();
		}
		
		gg.close();
	}

}

class Movie {
	private String title;
	private String director;
	private double rating;
	
	// Constructor mode 1
	public Movie(String title) {
		this.title = title;
		this.director = "Unknow";
		this.rating = 0.0;
	}
	
	// Constructor mode 2
	public Movie(String title,String director) {
		this.title = title;
		this.director = director;
		this.rating = 0.0;
	}
	
	// Constructor mode 3
	public Movie(String title,String director, double rating) {
		this.title = title;
		this.director = director;
		
		if(rating > 10.0) {
			this.rating = 10.0;
		}
		else if(rating < 0.0) {
			this.rating = 0.0;
		}
		else {
			this.rating = rating;
		}
	}
	
	public void displayDrtails() {
		System.out.println("Title: " + title + ", Director: " + director + " ,Rating: " + rating);
	}
	
	
}