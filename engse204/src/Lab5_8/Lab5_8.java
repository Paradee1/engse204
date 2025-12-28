package Lab5_8;

import java.util.Scanner;

public class Lab5_8 {

	public static void main(String[] args) {
		Scanner qw = new Scanner(System.in);
		
		// รับInputสำหรับ Student
		String name1 = qw.nextLine();
		int Id = qw.nextInt();
		qw.nextLine();
		
		// รับInputสำหรับ Employee
		String name2 = qw.nextLine();
		double salary = qw.nextDouble();
		
		Student student = new Student(name1, Id);
		Employee emp = new Employee(name2, salary);
		
		Person[] arr = { student, emp};
		
		for(Person p: arr) {
			if(p instanceof Employee) {
				Employee em = (Employee) p;
				em.applyBonus(1000.0);
			}
		}
		
		for(Person p : arr) {
			System.out.println(p.getStatus());
		}
		
		qw.close();
	}

}

//Superclass
class Person {
	
	// Attributes
	protected String name;
	
	// Constructor
	public Person(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return "Person:" + name;
	}
}

//Subclass
class Student extends Person {
	
	// Attributes
	protected int studentId;
	
	// Constructor
	public Student(String name,int studentId) {
		super(name);
		this.studentId = studentId;
	}
	
	// Methods
	@Override
	public String getStatus() {
		return "Student:" + name + ", ID:" + studentId; 
	}
}

//Subclass
class Employee extends Person {
	
	// Attributes
	protected double salary;
	
	// Constructor
	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	// Methods
	public void applyBonus(double bonus) {
		salary += bonus;
	}
	
	// Methods
	@Override
	public String getStatus() {
		return "Employee:" + name + " ,Salary:" + salary;
	}
}