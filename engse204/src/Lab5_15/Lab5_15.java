package Lab5_15;

import java.util.Scanner;

public class Lab5_15 {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		
		String model1 = sd.nextLine();
		double rentalRate1 = sd.nextDouble();
		sd.nextLine();
		
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

class RentalVehicle {
	protected String model;
	protected double rentalRate;
	
	public RentalVehicle(String model, double rentalRate) {
		this.model = model;
		this.rentalRate = rentalRate;
	}
	
	public double calculateFee() {
		return rentalRate;
	}
}

class Car extends RentalVehicle {
	public Car(String model, double rentalRate) {
		super(model, rentalRate);
	}
	
	@Override
	public double calculateFee() {
		return rentalRate + 100.0;
	}
}

class Motorcycle extends RentalVehicle {
	public Motorcycle(String model, double rentalRate) {
		super(model, rentalRate);
	}
	
	@Override
	public double calculateFee() {
		return rentalRate * 1.10 ;
	}
}