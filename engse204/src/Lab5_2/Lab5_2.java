package Lab5_2;

import java.util.Scanner;

public class Lab5_2 {

	public static void main(String[] args) {
		Scanner df = new Scanner(System.in);
		
		String Name = df.nextLine();
		int Age = df.nextInt();
		
		Cat cat = new Cat(Name, Age);
		cat.displayInfo();
		cat.makeSound();

		df.close();
	}

}

class Animal {
	protected String name;
	protected int age;
	
	public void makeSound() {
		System.out.println("I am a Animal.");
	}
	
	public void displayInfo() {
		System.out.println("Name:" + name + ", Age:" + age);
	}
}

class Cat extends Animal {
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}