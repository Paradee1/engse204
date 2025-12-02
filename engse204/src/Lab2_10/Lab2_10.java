package Lab2_10;

import java.util.Scanner;

public class Lab2_10 {

	public static void main(String[] rgs) {
		Scanner sp = new Scanner(System.in);
		
		// รับจำนวนสินค้าที่จะเพิ่มลงตะกร้า
		int N = sp.nextInt();
		sp.nextLine();
		
		ShoppingCart cart = new ShoppingCart() ;
		
		// รับข้อมูลสินค้าแต่ละชิ้น
		for(int i = 0 ; i < N ; i++ ) {
			
			// รับชื่อสินค้า
			String name = sp.nextLine();
			
			 // รับราคาสินค้า
			double price = sp.nextDouble();
			sp.nextLine();
			
		    // สร้างออบเจ็กต์สินค้า
			Product p = new Product(name, price) ;
			
			 // เพิ่มสินค้าลงตะกร้า
			cart.addProduct(p);
		}
		
		 // คำนวณราคารวม
		double total = cart.calculateTotalPrice() ;
		
		  // แสดงผลรวมราคา
		System.out.println(total) ;
		
		sp.close() ;
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
	
	
	// เพิ่มสินค้าแต่ละชิ้นลงใน array
	public void addProduct(Product p) {
		items[itemCount] = p ;
		itemCount++ ;
	}
	
	// รวมราคาสินค้าทั้งหมด
	public double calculateTotalPrice() {
		double sum = 0 ;
		
		for(int j = 0 ; j < itemCount ; j++ ) {
			sum += items[j].price ;
		}
		
		return sum ;
		
	}
}