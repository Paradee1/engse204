package Lab2_10;

import java.util.Scanner;

public class Lab2_10 {

	public static void main(String[] rgs) {
		Scanner sp = new Scanner(System.in);
		
		// รับจำนวนสินค้าที่จะเพิ่มลงตะกร้า
		int n = sp.nextInt();
		sp.nextLine();
		
		ShoppingCart cart = new ShoppingCart() ;
		
		for(int i = 0 ; i < n ; i++ ) {
			String name = sp.nextLine();
			double price = sp.nextDouble();
			sp.nextLine();
			
			Product p = new Product(name, price) ;
			cart.addProduct(p);
		}
		double total = cart.calculateTotalPrice();
		System.out.println(total);
		sp.close();
	}

}

class Product {
	private String name ;
	public double price ;
	
	public Product(String name, double price) {
		this.name = name ;
		this.price = price ;
	}
}

class ShoppingCart {
	private Product[] items = new Product[10] ;
	private int itemCount ;
	
	public void addProduct(Product p) {
		items[itemCount] = p ;
		itemCount++ ;
	}
	
	public double calculateTotalPrice() {
		double sum = 0 ;
		
		for(int i = 0 ; i < itemCount ; i++ ) {
			sum += items[i].price ;
		}
		
		return sum ;
		
	}
}