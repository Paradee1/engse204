package Lab5_3;

import java.util.Scanner;

public class Lab5_3 {

	public static void main(String[] args) {
		Scanner gf = new Scanner(System.in);
		
		// รับเงินเดือนตามลำดับ
		double Salary = gf.nextDouble();
		
		Manager manager = new Manager(Salary);
		
		double bonus = manager.calculateBonus();
		
		System.out.println("Bonus :" + bonus);
		
		gf.close();
	}

}

// Superclass/Parent
class Employee {
	
	// Attributes
	protected double salary;
	
	// Methods
	public double calculateBonus() {
		return salary * 0.10;
	}
}

//Subclass/Child
class Manager extends Employee{
	
	// Constructor
	public Manager(double salary) {
		this.salary = salary;
	}
	
	// Methods
	@Override
	public double calculateBonus() {
		double bonus = super.calculateBonus();
		return bonus += salary * 0.05;
	}
}