package Lab5_3;

import java.util.Scanner;

public class Lab5_3 {

	public static void main(String[] args) {
		Scanner gf = new Scanner(System.in);
		
		double Salary = gf.nextDouble();
		
		Manager manager = new Manager(Salary);
		
		double bonus = manager.calculateBonus();
		
		System.out.println("Bonus :" + bonus);
		
		gf.close();
	}

}

class Employee {
	protected double salary;
	
	public double calculateBonus() {
		return salary * 0.10;
	}
}

class Manager extends Employee{
	
	public Manager(double salary) {
		this.salary = salary;
	}
	
	@Override
	public double calculateBonus() {
		double bonus = super.calculateBonus();
		return bonus += salary * 0.05;
	}
}