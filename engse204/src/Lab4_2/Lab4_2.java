package Lab4_2;

import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) {
		Scanner ax = new Scanner(System.in);
		
		int N = ax.nextInt();
		ax.nextLine();
		
		if(N == 1) {
			String name = ax.nextLine();
			Product pd = new Product(name);
			pd.displayInfo();
		}
		else if(N == 2) {
			String name = ax.nextLine();
			double price = ax.nextDouble();
			
			Product pd = new Product(name, price);
			pd.displayInfo();
		}
		
		ax.close();
	}

}

class Product {
	private String name;
	private double price;
	
	public Product(String name) {
		this.name = name;
		this.price = 0.0;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println("Product: " + name + ", Price: " + price);
	}
}