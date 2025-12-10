package Lab3_8;

import java.util.Scanner;

public class Lab3_8 {

	public static void main(String[] rgs) {
		Scanner st = new Scanner(System.in);
		
		String name = st.nextLine();
		int startStock = st.nextInt();
		
		InventoryItem iv = new InventoryItem(name, startStock);
		
		int N = st.nextInt();
		st.nextLine();
		
		for(int i = 0 ; i < N ; i++) {
			String order = st.next();
			int Amount = st.nextInt();
			
			if(order.equals("ADD")) {
				iv.addStock(Amount);
			}
			else if(order.equals("SELL")) {
				iv.sellStock(Amount);
				
			}
		}
		
		System.out.println("Final:" + iv.getStock());
	}

}

class InventoryItem {
	private String productName;
	private int stock;
	
	public InventoryItem(String productName, int intialStock) {
		this.productName = productName;
		
		if(intialStock >= 0) {
			this.stock = intialStock;
		}
		else {
			this.stock = 0;
		}
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void addStock(int amount) {
		if(amount > 0) {
			stock += amount;
			System.out.println("Stock added.");
		}
		else {
			System.out.println("Invalid amount.");
		}
	}
	
	public void sellStock(int amount) {
		if(amount > 0 && amount <= stock) {
			stock -= amount;
			System.out.println("Sale successful.");
		}
		else if(amount > stock) {
			System.out.println("Not enough stock.");
		}
		else {
			System.out.println("Invalid amount.");
		}
	}
}