package Lab5_1;

import java.util.Scanner;

public class Lab5_1 {

	public static void main(String[] args) {
		Scanner sf = new Scanner(System.in);
		
		String Name = sf.nextLine();
		int Age = sf.nextInt();
		
		Dog dog = new Dog(Name, Age);
		dog.makeSound();
		dog.displayInfo();
		
		sf.close();
	}

}

class Animal {
	protected String name;
	protected int age;
	
	public void displayInfo() {
		System.out.println("Name:" + name + ", Age:" + age);
	}
}

class Dog extends Animal{
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}