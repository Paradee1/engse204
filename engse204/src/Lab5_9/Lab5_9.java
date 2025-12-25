package Lab5_9;

import java.util.Scanner;

public class Lab5_9 {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		
		String name1 = sd.nextLine();
		double unitPrice = sd.nextDouble();
		int quantity = sd.nextInt();
		sd.nextLine();
		
		String name2 = sd.nextLine();
		double amounthlyCost = sd.nextDouble();
		int mounths = sd.nextInt();
		
		PhysicalProduct phy = new PhysicalProduct(name1, unitPrice, quantity);
		DigitalSubscription dgt = new DigitalSubscription(name2, amounthlyCost, mounths);
		
		Item[] items = { phy, dgt };
		
		double total = 0;
		
		for(Item i : items) {
			total += i.getValue();
		}
		
		System.out.println(total);
		
		sd.close();
	}

}

class Item {
	protected String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return 0.0;
	}
}

class PhysicalProduct extends Item {
	protected double unitPrice;
	protected int quantity;
	
	public PhysicalProduct(String name, double unitPrice, int quantity) {
		super(name);
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	@Override
	public double getValue() {
		return unitPrice * quantity;
	}
}

class DigitalSubscription extends Item {
	protected double amounthlyCost;
	protected int mounths;
	
	public DigitalSubscription(String name, double amounthlyCost, int mounths) {
		super(name);
		this.amounthlyCost = amounthlyCost;
		this.mounths = mounths;
	}
	
	@Override
	public double getValue() {
		return amounthlyCost * mounths;
	}
}