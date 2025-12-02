package Lab2_11;

import java.util.Scanner;

public class Lab2_11 {

	public static void main(String[] rgs) {
		Scanner md = new Scanner(System.in) ;
		
		String name = md.nextLine() ;
		int year = md.nextInt() ;
		int newyear = md.nextInt() ;
		
		Car st = new Car(name, year) ;
		
		st.setYear(newyear) ;

		System.out.println("Model" +st.getModel()) ;
		System.out.println("Year:" +st.getYear()) ;
	}

}

class Car {
	private String model ;
	private int year ;
	
	public Car(String model, int year) {
		this.model = model ;
		this.year = year ;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year ;
	}
	
	public void setYear(int newYear) {
		year = newYear ;
	}
	
}