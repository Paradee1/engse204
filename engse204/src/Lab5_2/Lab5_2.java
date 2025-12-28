package Lab5_2;

import java.util.Scanner;

public class Lab5_2 {

    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);

        // รับชื่อ, อายุ
        String name = df.nextLine();
        int age = df.nextInt();

        Cat cat = new Cat(name, age);
        cat.displayInfo();
        cat.makeSound();

        df.close();
    }

}

// Superclass
class Animal {

    // Attributes
    protected String name;
    protected int age;

    // Methods
    public void makeSound() {
        System.out.println("I am an Animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass / Child
class Cat extends Animal {

    // Constructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
