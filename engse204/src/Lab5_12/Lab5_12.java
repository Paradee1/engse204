package Lab5_12;

import java.util.Scanner;

public class Lab5_12 {

	public static void main(String[] args) {
		Scanner zx = new Scanner(System.in);
		
		// รับInputสำหรับ BasicService
		String name1 = zx.nextLine();
		double base1 = zx.nextDouble();
		zx.nextLine();
		
		// รับInputสำหรับ PremiumService
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

//Superclass
class Service {
	
	// Attributes
	protected String name;
	protected double basePrice;
	
	// Constructor
	public Service(String name, double basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}
	
	// Methods
	public double calculateFinalPrice() {
		return basePrice;
	}
}

//Subclass
class BasicService extends Service {
	
	// Constructor
	public BasicService(String name, double basePrice) {
		super(name, basePrice);
	}
	
	// Methods
	@Override
	public double calculateFinalPrice() {
		return basePrice * 1.05 ;
	}
}

//Subclass
class PremiumService extends Service {
	
	// Attributes
	protected double premiumRate;
	
	// Constructor
	public PremiumService(String name, double basePrice, double premiumRate) {
		super(name, basePrice);
		this.premiumRate = premiumRate;
	}
	
	// Methods
	@Override
	public double calculateFinalPrice() {
		return basePrice * (1 + premiumRate);
	}
}