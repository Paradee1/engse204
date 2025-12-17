package Lab4_12;

import java.util.Scanner;

public class Lab4_12 {

	public static void main(String[] args) {
		Scanner lp = new Scanner(System.in);
		
		String Name = lp.nextLine();
		int StartHour = lp.nextInt();
		int NewHour = lp.nextInt();
		
		Schedule sch1 = new Schedule(StartHour);
		
		EmployeeSchedule emp1 = new EmployeeSchedule(Name, sch1);
		EmployeeSchedule emp2 = new	EmployeeSchedule(emp1);
		sch1.setHour(NewHour);
		
		emp1.displaySchedule();
		emp2.displaySchedule();
		
		lp.close();
		
	}

}

class Schedule {
	private int hour;
	
	public Schedule(int hour) {
		this.hour = hour;
	}
	public void setHour(int newHour) {
		hour = newHour;
	}
	
	public int getHour() {
		return hour;
	}
}

class EmployeeSchedule {
	private String name;
	private Schedule schedule;
	
	public EmployeeSchedule(String name, Schedule schedule) {
		this.name = name;
		this.schedule = schedule;
	}
	
	public EmployeeSchedule(EmployeeSchedule other) {
		this.name = other.name;
		this.schedule = new Schedule(other.schedule.getHour());	
	}
	
	public void displaySchedule() {
		System.out.println(name + ": " + schedule.getHour() + ":00");
	}
}