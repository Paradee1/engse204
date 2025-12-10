package Lab3_4;

import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] rgs) {
		Scanner pd = new Scanner(System.in);
		
		int N = pd.nextInt();
		
		pd.nextLine();
		
		for(int i = 0; i < N; i++) {
			String name = pd.nextLine();
			Product pr = new Product(name);
		}
		
		System.out.println(Product.getProductCount());
		pd.close();
	}

}

class Product {
	private String name;
	private static int productCount = 0;
	
	public Product(String name) {
		this.name = name;
		productCount++;
	}
	
	public String getName() {
		return name;
	}
	
	public static int getProductCount() {
		return productCount;
	}
	
}