package Lab5_1;

import java.util.Scanner;

public class Lab5_1 {

	public static void main(String[] args) {
		Scanner sf = new Scanner(System.in);
		
		// รับชื่อ,อายุ
		String Name = sf.nextLine();
		int Age = sf.nextInt();
		
		Dog dog = new Dog(Name, Age);
		dog.makeSound();
		dog.displayInfo();
		
		sf.close();
	}

}

// Subclass/Parent
class Animal {
	
	// Attributes
	protected String name;
	protected int age;
	
	// Methods
	public void displayInfo() {
		System.out.print("Name:" + name);
		System.out.print(", Age:" + age);
	}
}

// Subclass/Child
class Dog extends Animal{
	
	// Constructor
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Methods
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}