package Lab4_2;

import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) {
		Scanner ax = new Scanner(System.in);
		
		// รับโหมด 1 หรือ 2
		int N = ax.nextInt();
		ax.nextLine();
		
		if(N == 1) {
			
			// รับชื่อสินค้าอย่างเดียว
			String name = ax.nextLine();
			Product pd = new Product(name);
			pd.displayInfo();
		}
		else if(N == 2) {
			
			// รับชื่อสินค้าและราคา
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
	
	// Constructor 
	public Product(String name) {
		this.name = name;
		this.price = 0.0;
	}
	
	// Constructor 
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println("Product: " + name + ", Price: " + price);
	}
}