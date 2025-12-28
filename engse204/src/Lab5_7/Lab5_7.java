package Lab5_7;

import java.util.Scanner;

public class Lab5_7 {

	public static void main(String[] args) {
		Scanner fd = new Scanner(System.in);
		
		// รับInputสำหรับ SalesEmployee
		String name1 = fd.nextLine();
		double salary1 = fd.nextDouble();
		double rate = fd.nextDouble();
		fd.nextLine();
		
		// รับInputสำหรับ Manager
		String name2 = fd.nextLine();
		double salary2 = fd.nextDouble();
		double bonus = fd.nextDouble();
		
		SalesEmployee saleE = new SalesEmployee(name1, salary1, rate);
		Manager manager = new Manager(name2, salary2, bonus);
		
		PayrollProcessor.process(saleE);
		PayrollProcessor.process(manager);
		
		fd.close();
	}

}

//Superclass
class Employee {
	
	// Attributes
	protected String name;
	protected double baseSalary;
	
	// Constructor
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	// Methods
	public double calculatePay() {
		return baseSalary;
	}
}

//Subclass
class SalesEmployee extends Employee {
	
	// Attributes
	protected double commissionRate;
	
	// Constructor
	public SalesEmployee(String name, double baseSalary, double commissionRate) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
	}
	
	// Methods
	@Override
	public double calculatePay() {
		return baseSalary + (baseSalary * commissionRate);
	}
}

//Subclass
class Manager extends Employee {
	
	// Attributes
	protected double fixedBonus;
	
	// Constructor
	public Manager(String name, double baseSalary, double fixedBonus) {
		super(name, baseSalary);
		this.fixedBonus = fixedBonus;
	}
	
	// Methods
	@Override
	public double calculatePay() {
		return baseSalary + fixedBonus;
	}
}

//Utility Class
class PayrollProcessor {
	
	// Methods
	public static void process(Employee e) {
		System.out.println(e.name + " total pay:" + e.calculatePay());
	}
}