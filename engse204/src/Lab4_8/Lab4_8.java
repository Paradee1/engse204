package Lab4_8;

import java.util.Scanner;

public class Lab4_8 {

	public static void main(String[] args) {
		Scanner gg = new Scanner(System.in);
		
		int mode = gg.nextInt();
		gg.nextLine();
		
		if(mode == 1) {
			String name = gg.nextLine();
			Movie movie = new Movie(name);
			movie.displayDrtails();
		}
		else if(mode == 2) {
			String name = gg.nextLine();
			String direc = gg.nextLine();
			Movie movie = new Movie(name, direc);
			movie.displayDrtails();
		}
		else if(mode == 3) {
			String name = gg.nextLine();
			String direc = gg.nextLine();
			double rat = gg.nextDouble();
			Movie movie = new Movie(name, direc, rat);
			movie.displayDrtails();
		}

	}

}

class Movie {
	private String title;
	private String director;
	private double rating;
	
	public Movie(String title) {
		this.title = title;
		this.director = "Unknow";
		this.rating = 0.0;
	}
	
	public Movie(String title,String director) {
		this.title = title;
		this.director = director;
		this.rating = 0.0;
	}
	
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