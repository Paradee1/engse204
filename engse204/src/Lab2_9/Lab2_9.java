package Lab2_9;

import java.util.Scanner;

public class Lab2_9 {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		String name = st.nextLine();
		String road = st.nextLine();
		String city = st.nextLine();
		String postcode = st.nextLine();
		
		Address sa = new Address(road, city, postcode) ;
		
		Student sp = new Student(name, sa) ;
		
		sp.displayProfile();
		
		
	}

}

class Address {
	private String street ;
	private String city ;
	private String zipCode ;
	
	public Address(String street, String city, String zipCode) {
		this.street = street ;
		this.city = city ;
		this.zipCode = zipCode ;
	}
	
	public String getFullAddress() {
		return street + ", " + city + ", " + zipCode ;
	}
	
}

class Student {
	private String name ;
	private Address address ;
	
	public Student(String name, Address address) {
		this.name = name ;
		this.address = address ;
		
	}
	
	public void displayProfile() {
		System.out.println("Name: " + name) ;
		System.out.println("Address: " + address.getFullAddress()) ;
	}
}