package Lab5_12;

import java.util.Scanner;

public class Lab5_12 {

	public static void main(String[] args) {
		Scanner zx = new Scanner(System.in);
		
		String name1 = zx.nextLine();
		double base1 = zx.nextDouble();
		zx.nextLine();
		
		String name2 = zx.nextLine();
		double base2 = zx.nextDouble();
		double premiumRate = zx.nextDouble();
		
		BasicService basic = new BasicService(name1, base1);
		PremiumService premium = new PremiumService(name2, base2, premiumRate);
		
		Service[] service = { basic, premium };
		
		for(Service s : service) {
			System.out.println(s.calculateFinalPrice());
		}
		
		zx.close();
	}

}

class Service {
	protected String name;
	protected double basePrice;
	
	public Service(String name, double basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}
	
	public double calculateFinalPrice() {
		return basePrice;
	}
}

class BasicService extends Service {
	public BasicService(String name, double basePrice) {
		super(name, basePrice);
	}
	
	@Override
	public double calculateFinalPrice() {
		return basePrice * 1.05 ;
	}
}

class PremiumService extends Service {
	protected double premiumRate;
	
	public PremiumService(String name, double basePrice, double premiumRate) {
		super(name, basePrice);
		this.premiumRate = premiumRate;
	}
	
	@Override
	public double calculateFinalPrice() {
		return basePrice * (1 + premiumRate);
	}
}