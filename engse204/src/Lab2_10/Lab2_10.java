package Lab2_10;

import java.util.Scanner;

public class Lab2_10 {

	public static void main(String[] rgs) {
		Scanner ps = new Scanner(System.in);

		// จำนวนสินค้าที่จะเพิ่มลงตะกร้า
		int N = ps.nextInt();
		ps.nextLine();
		
		ShoppingCart sp = new ShoppingCart();
		
		for(int j = 0 ; j < N ; j++ ) {
			
			// ชื่อสินค้า
			String productname = ps.nextLine() ;
			
			//ราคาสินค้า
			double productprice = ps.nextDouble() ;
			ps.nextLine();
			
			Product pd = new Product(productname, productprice) ;
			
			sp.addProduct(pd);
		}
		
		double totalfinal = sp.calculateTotalPrice();
		
		// แสดงราคารวมสินค้า
		System.out.println(totalfinal);
		
		ps.close();
	}

}

class Product {
	private String name ;
	private double price ;
	
	public Product(String name, double price) {
		this.name = name ;
		this.price = price ;
	}
	
	public double getPrice() { 
        return price;
    }
}

class ShoppingCart {
	private Product[] items = new Product[10] ;
	private int itemCount ;
	
	// เพิ่มสินค้าในarray
	public void addProduct(Product p) {
		items[itemCount] = p ;
		itemCount++ ;
	}
	
	// รวมราคาสินค้า
	public double calculateTotalPrice() {
		double total = 0 ;
		
		for(int i = 0 ; i < itemCount ; i++ ) {
			total += items[i].getPrice() ;
		}
		
		return total ;
	}
}