package Lab5_7;

import java.util.Scanner;

public class Lab5_7 {

	public static void main(String[] args) {
		Scanner fd = new Scanner(System.in);
		
		String name1 = fd.nextLine();
		double salary1 = fd.nextDouble();
		double rate = fd.nextDouble();
		fd.nextLine();
		
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

class Employee {
	protected String name;
	protected double baseSalary;
	
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public double calculatePay() {
		return baseSalary;
	}
}

class SalesEmployee extends Employee {
	protected double commissionRate;
	
	public SalesEmployee(String name, double baseSalary, double commissionRate) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double calculatePay() {
		return baseSalary + (baseSalary * commissionRate);
	}
}

class Manager extends Employee {
	protected double fixedBonus;
	
	public Manager(String name, double baseSalary, double fixedBonus) {
		super(name, baseSalary);
		this.fixedBonus = fixedBonus;
	}
	
	@Override
	public double calculatePay() {
		return baseSalary + fixedBonus;
	}
}

class PayrollProcessor {
	public static void process(Employee e) {
		System.out.println(e.name + " total pay:" + e.calculatePay());
	}
}