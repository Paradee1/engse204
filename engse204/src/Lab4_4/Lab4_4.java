package Lab4_4;

import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		double Latitude = cs.nextDouble();
		double Longitude = cs.nextDouble();
		double newLatitude = cs.nextDouble();
		
		Location loc1 = new Location(Latitude, Longitude);
		Location loc2 = new Location(loc1);
		
		loc1.setLatitude(newLatitude);
		
		loc1.displayInfo();
		loc2.displayInfo();
		
		cs.close();
	}

}

class Location {
	private double latitude;
	private double longitude;
	
	public Location(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Location(Location other) {
		this.latitude = other.latitude;
		this.longitude = other.longitude;
	}
	
	public void setLatitude(double newLat) {
		latitude = newLat;
	}
	
	public void displayInfo() {
		System.out.println("Lat:" +  latitude + ", Lon: " + longitude);
	}
}