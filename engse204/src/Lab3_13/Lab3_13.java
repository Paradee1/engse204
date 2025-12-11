package Lab3_13;

import java.util.Scanner;

public class Lab3_13 {

	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		
		int N = sm.nextInt();
		sm.nextLine();
		
		for(int i = 0 ; i < N ; i++) {
			String order = sm.nextLine();
			
			if(order.equals("SET")) {
				int Newq = sm.nextInt();
				sm.nextLine();
				
				LicenseManager.setMax(Newq);
			}
			else if(order.equals("CHECKOUT")) {
				LicenseManager.checkOut();
			}
			else if(order.equals("CHECKIN")) {
				LicenseManager.checkIn();
			}
			else if(order.equals("STATUS")) {
				LicenseManager.displayStatus();
			}
		}
	}

}

class LicenseManager {
	private static int maxLicenses = 10 ;
	private static int usedLicenses = 0 ;
	
	public static void setMax(int Max) {
		if(Max < 0 ) {
			System.out.println("Invalid max value.");
			
		}
		else if(Max < usedLicenses) {
			System.out.println("Cannot set max lower than current usaga.");
		}
		else {
			maxLicenses = Max;
			System.out.println("Max licenses set to [" + Max + "]");
		}
	}
	
	 public static boolean checkOut() {
	        if(usedLicenses < maxLicenses) {
	            usedLicenses++;
	            System.out.println("Checkout successful.");
	            return true;
	        }
	        else {
	            System.out.println("Checkout failed: No licenses available.");
	            return false;
	        }
	    }
	
	public static void checkIn() {
		if(usedLicenses > 0) {
			usedLicenses--;
			System.out.println("Check-in successful.");
		}
		else {
			System.out.println("Nothing to check-in.");
		}
	}
	
	public static void displayStatus() {
		System.out.println("User:[" + usedLicenses + "]");
		System.out.println("Avaliable:[" + (maxLicenses-usedLicenses) + "]");
	}
}

