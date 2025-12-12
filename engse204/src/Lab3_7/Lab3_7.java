package Lab3_7;

import java.util.Scanner;

public class Lab3_7 {

	public static void main(String[] rgs) {
		Scanner dp = new Scanner(System.in);
		
		String id = dp.nextLine();
		String depart = dp.nextLine();
		String newdepart = dp.nextLine();
		
		Employee em = new Employee(id, depart);
		
		em.setDepartment(newdepart);
		em.getEmployeeId();
		em.getDepartment();
		
		System.out.println("-------------------------");
		System.out.println(em.getEmployeeId());
		System.out.println(em.getDepartment());
		
		dp.close();
	}

}

class Employee {
	private String employeeId;
	private String department;
	
	public Employee(String employeeId, String department) {
		this.employeeId = employeeId;
		this.department = department;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
}