package Lab5_10;

import java.util.Scanner;

public class Lab5_10 {

	public static void main(String[] args) {
		Scanner qw = new Scanner(System.in);
		
		String description1 = qw.nextLine();
		int hour1 = qw.nextInt();
		double fee = qw.nextDouble();
		qw.nextLine();
		
		String description2 = qw.nextLine();
		int hour2 = qw.nextInt();

		ComplexTask complex = new ComplexTask(description1, hour1, fee);
		SimpleTask simple = new SimpleTask(description2, hour2);
		
		ProjectTask[] project = { complex, simple };
		
		for(ProjectTask p : project) {
			System.out.println(p.calculateCost());
		}
		
		qw.close();
	}

}

class ProjectTask {
	protected String description;
	protected int baseHours;
	
	public ProjectTask(String desc,int hour) {
		this.description = desc;
		this.baseHours = hour;
	}
	
	public double calculateCost() {
		return baseHours * 50.0;
	}
}

class ComplexTask extends ProjectTask {
	protected double setupFee;
	
	public ComplexTask(String decs,int hour, double fee) {
		super(decs, hour);
		this.setupFee = fee;
	}
	
	@Override
	public double calculateCost() {
		return (super.calculateCost() * 1.10) + setupFee;
	}
}

class SimpleTask extends ProjectTask {
	
	public SimpleTask(String decs,int hour) {
		super(decs, hour);
	}
	
	@Override
	public double calculateCost() {
		return super.calculateCost();
	}
}