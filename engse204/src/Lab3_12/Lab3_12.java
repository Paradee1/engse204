package Lab3_12;

import java.util.Scanner;

public class Lab3_12 {

	public static void main(String[] args) {
		Scanner nw = new Scanner(System.in);
		
		String Name = nw.nextLine();
		
		double monthlySalary = nw.nextDouble();
		double taxRate = nw.nextDouble();
		double raiseAmount = nw.nextDouble();
		
		Employee em = new Employee(Name, monthlySalary);
		
		System.out.println("Tax (Before):" + em.calculateTax(taxRate));
		em.giveRaise(raiseAmount);
		System.out.println("Tax (After):" + em.calculateTax(taxRate));
		
		nw.close();
	}

}

class Employee {
	private String name;
	private double monthlySalary;
	
	public Employee(String name, double monthlySalary) {
		this.name = name;
		if(monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}
		else {
			this.monthlySalary = 0;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void giveRaise(double amount) {
		if(amount > 0) {
			monthlySalary += amount ;
			System.out.println("Raise applied.");
		}
		else {
			System.out.println("Invalid amount.");
		}
	}
	
	private double getAnnualSalary() {
		return monthlySalary * 12;
	}
	
	public double calculateTax(double taxRate) {
		
		return getAnnualSalary() * taxRate;
	}
	
}