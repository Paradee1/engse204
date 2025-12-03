package Lab2_10;

import java.util.Scanner;

public class L {

	public static void main(String[] rgs) {
		Scanner as = new Scanner(System.in);

		int N = as.nextInt();
		as.nextLine();
		
		ShoppingCart mi = new ShoppingCart();
		
		for(int j = 0 ; j < N ; j++ ) {
			
			String pdname = as.nextLine();
			
			double pdprice = as.nextDouble();
			
			as.nextLine();
			
			Product dp = new Product(pdname, pdprice);
			
			mi.addProduct(dp);
		}
		
		double total = mi.calculateTotalPrice();
		
		System.out.println(total);
		
		as.close();
	}

}

class Product {
	private String name;
	public double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

}

class ShoppingCart {
	private Product[] items = new Product[10];
	private int itemCount;

	public void addProduct(Product p) {
		items[itemCount] = p;
		itemCount++;
	}
	
	public double calculateTotalPrice() {
		double sum = 0;
		
		for(int i = 0 ; i < itemCount ; i++ ) {
			sum += items[i].price;
		}
		
		return sum;
	}
	
}