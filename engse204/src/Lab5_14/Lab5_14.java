package Lab5_14;

import java.util.Scanner;

public class Lab5_14 {

	public static void main(String[] args) {
		Scanner fd = new Scanner(System.in);
		
		String id1 = fd.nextLine();
		double baseFee1 = fd.nextDouble();
		fd.nextLine();
		
		String id2 = fd.nextLine();
		double baseFee2 = fd.nextDouble();
		double insuranceFee = fd.nextDouble();
		
		StandardShipping std = new StandardShipping(id1,baseFee1);
		PremiumShipping prm = new PremiumShipping(id2, baseFee2, insuranceFee);
		
		Shipping[] shp = { std, prm };
		
		for(Shipping s: shp) {
			System.out.println(s.calculateTotalFee());
		}
		
		fd.close();
	}

}

class Shipping {
	protected String trackingId;
	protected double baseFee;
	
	public Shipping(String trackingId, double baseFee) {
		this.trackingId = trackingId;
		this.baseFee = baseFee;
	}
	
	public double calculateTotalFee() {
		return baseFee;
	}
}

class StandardShipping extends Shipping { 
	public StandardShipping(String trackingId, double baseFee) {
		super(trackingId, baseFee);
	}
	
	@Override
	public double calculateTotalFee() {
		return baseFee * 1.05 ;
	}
}

class PremiumShipping extends Shipping {
	protected double insuranceFee;
	
	public PremiumShipping(String trackingId, double baseFee, double insuranceFee) {
		super(trackingId, baseFee);
		this.insuranceFee = insuranceFee;
	}
	
	@Override
	public double calculateTotalFee() {
		super.calculateTotalFee();
		return baseFee + insuranceFee;
	}
}