package Lab4_13;

import java.util.Scanner;

public class Lab4_13 {

	public static void main(String[] args) {
		Scanner dd = new Scanner(System.in);
		
		int maxDuration = dd.nextInt();
		dd.nextLine();
		
		String Planname = dd.nextLine();
		int Days = dd.nextInt();
		
		int exDays1 = dd.nextInt();
		int exDays2 = dd.nextInt();
		
		Subscription.setMaxDuration(maxDuration);
		
		Subscription sub = new Subscription(Planname, Days);
		
		sub = sub.extend(exDays1);
		sub = sub.extend(exDays2);
		
		sub.displayInfo();
		
		dd.close();
	}

}

class Subscription {
	private final String planName;
	private final int durationDays;
	
	private static int maxDuration = 365;
	
	public Subscription(String planName, int durationDays) {
		this.planName = planName;
		
		if(durationDays > maxDuration) {
			this.durationDays = maxDuration;
		}
		else if(durationDays < 0) {
			this.durationDays = 0;
		}
		else {
			this.durationDays = durationDays;
		}
	}
	
	public Subscription(Subscription other) {
		this.planName = other.planName;
		this.durationDays = other.durationDays;
	}
	
	public static void setMaxDuration(int max) {
		if(max > 0) {
			maxDuration = max;
			System.out.println("Max duration set to " + maxDuration);
		}
		else {
			System.out.println("Invalid max policy.");
		}
	}
	
	public Subscription extend(int days) {
		if(days <= 0) {
			System.out.println("Invalid extension days.");
			return this;
		}
		
		int newDays = this.durationDays + days;
		
		if(newDays > maxDuration) {
			System.out.println("Extension failed: Exceeds max policy.");
			return this;
		}
		
		System.out.println("Extension successful.");
		return new Subscription(planName, newDays);
	}
	
	public void displayInfo() {
		System.out.println("Plan: " + planName + ", Days: " + durationDays);
	}
	
}