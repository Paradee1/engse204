package Lab5_6;

import java.util.Scanner;

public class Lab5_6 {

	public static void main(String[] args) {
		Scanner qw = new Scanner(System.in);

		String Title1 = qw.nextLine();
		int Duration = qw.nextInt();
		qw.nextLine();
		
		String Title2 = qw.nextLine();
		String Quality = qw.nextLine();
		
		Video video = new Video(Title1, Duration);
		Audio audio = new Audio(Title2, Quality);
		
		Processor.runProcessor(video);
		Processor.runProcessor(audio);
		
		qw.close();
	}

}

class Media {
	protected String title;
	
	public Media(String title) {
		this.title = title;
	}
	
	public void process() {
		System.out.println("Starting generic media processing.");
	}
}

class Video extends Media {
	protected int duration;
	
	public Video(String title, int duration) {
		super(title);
		this.duration = duration;
	}
	
	@Override
	public void process() {
		System.out.println("Processing video:" + title + " for " + duration + " minutes.");
	}
}

class Audio extends Media {
	protected String quality;
	
	public Audio(String title, String quality) {
		super(title);
		this.quality = quality;
	}
	
	@Override
	public void process() {
		System.out.println("Processing audio:" + title + " with " +  quality + " quality.");
	}
}

class Processor {
	public static void runProcessor(Media m) {
		m.process();
	}
}