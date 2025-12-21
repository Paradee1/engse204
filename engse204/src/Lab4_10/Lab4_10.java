package Lab4_10;

import java.util.Scanner;

public class Lab4_10 {

	public static void main(String[] args) {
		Scanner im = new Scanner(System.in);
		
		// รับโหมด 1,2
		int mode = im.nextInt();
		
		// ไม่รับค่าเพิ่ม สร้างobject TimePeriod
		if(mode == 1) {
			TimePeriod time = new TimePeriod();
			time.displayPeriod();
		}
		
		// รับค่าStratHour และ EndHour สร้างobject TimePeriod
		else if(mode == 2) {
			int StratH = im.nextInt();
			int EndH = im.nextInt();
			
			TimePeriod time = new TimePeriod(StratH, EndH);
			time.displayPeriod();
		}
		
		im.close();
	}

}

class TimePeriod {
	private int startHour;
	private int endHour;
	
	// Default Constructor
	public TimePeriod() {
		this.startHour = 9;
		this.endHour = 17;
	}
	
	// Main Constructor
	public TimePeriod(int startHour, int endHour) {
		if(startHour < 0) {
			startHour = 0;
		}
		else if(startHour > 23) {
			startHour = 23;
		}
		
		if(endHour < 0) {
			endHour = 0;
		}
		else if(endHour > 23) {
			endHour = 23;
		}
		
		if(startHour > endHour) {
			int temp = startHour;
			startHour = endHour;
			endHour = temp;
		}
		
		this.startHour = startHour;
		this.endHour = endHour;
	}
	
	public void displayPeriod() {
		System.out.println(startHour + ":00-" + endHour + ":00" );
	}
}