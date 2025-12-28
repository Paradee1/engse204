package Lab5_15;

import java.util.Scanner;

public class Lab5_15 {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		
		// รับInputสำหรับ Car
		String model1 = sd.nextLine();
		double rentalRate1 = sd.nextDouble();
		sd.nextLine();
		
		// รับInputสำหรับ Motorcycle
		String model2 = sd.nextLine();
		double rentalRate2 = sd.nextDouble();
		
		Car car = new Car(model1, rentalRate1);
		Motorcycle mtc = new Motorcycle(model2, rentalRate2);
		
		RentalVehicle[] rtv = { car, mtc };
		
		double totalRentalFee = 0; 
		
		for(RentalVehicle r : rtv) {
			totalRentalFee += r.calculateFee();
		}
		
		System.out.println(totalRentalFee);
		
		sd.close();
	}

}

//Superclass
class RentalVehicle {
	
	// Attributes
	protected String model;
	protected double rentalRate;
	
	// Constructor
	public RentalVehicle(String model, double rentalRate) {
		this.model = model;
		this.rentalRate = rentalRate;
	}
	
	// Methods
	public double calculateFee() {
		return rentalRate;
	}
}

//Subclass
class Car extends RentalVehicle {
	
	// Constructor
	public Car(String model, double rentalRate) {
		super(model, rentalRate);
	}
	
	// Methods
	@Override
	public double calculateFee() {
		return rentalRate + 100.0;
	}
}

//Subclass
class Motorcycle extends RentalVehicle {
	
	// Constructor
	public Motorcycle(String model, double rentalRate) {
		super(model, rentalRate);
	}
	
	// Methods
	@Override
	public double calculateFee() {
		return rentalRate * 1.10 ;
	}
}