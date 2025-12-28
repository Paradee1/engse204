package Lab5_6;

import java.util.Scanner;

public class Lab5_6 {

	public static void main(String[] args) {
		Scanner qw = new Scanner(System.in);

		// รับInputสำหรับ Video
		String Title1 = qw.nextLine();
		int Duration = qw.nextInt();
		qw.nextLine();
		
		// รับInputสำหรับ Audio
		String Title2 = qw.nextLine();
		String Quality = qw.nextLine();
		
		Video video = new Video(Title1, Duration);
		Audio audio = new Audio(Title2, Quality);
		
		Processor.runProcessor(video);
		Processor.runProcessor(audio);
		
		qw.close();
	}

}

// Superclass / Parent
class Media {
	
	// Attributes
	protected String title;
	
	// Constructor
	public Media(String title) {
		this.title = title;
	}
	
	// Methods
	public void process() {
		System.out.println("Starting generic media processing.");
	}
}

// Subclass / Child
class Video extends Media {
	
	// Attributes
	protected int duration;
	
	// Constructor
	public Video(String title, int duration) {
		super(title);
		this.duration = duration;
	}
	
	// Methods
	@Override
	public void process() {
		System.out.print("Processing video:" + title);
		System.out.print(" for ");
		System.out.println(duration + " minutes.");
	}
}

// Subclass / Child
class Audio extends Media {
	
	// Attributes
	protected String quality;
	
	// Constructor
	public Audio(String title, String quality) {
		super(title);
		this.quality = quality;
	}
	
	// Methods
	@Override
	public void process() {
		System.out.print("Processing audio:" + title);
		System.out.print(" with ");
		System.out.println(quality + " quality.");
	}
}

// Utility Class
class Processor {
	public static void runProcessor(Media m) {
		m.process();
	}
}