package Lab2_6;

import java.util.Scanner;

public class Lab2_6 {

	public static void main(String[] rgs) {
		Scanner am = new Scanner(System.in) ;
		
		System.out.print( "Name:" ) ;
		String name = am.nextLine() ;
		
		System.out.print( "InitialBalance:" ) ;
		double balance = am.nextDouble() ;
		
		System.out.print( "deposit:" ) ;
		double amount = am.nextDouble() ;
		
		BankAccount dp = new BankAccount(name, balance) ;
		
		dp.deposit(amount) ;
		
		dp.displaySummary() ;
		
		am.close() ;
	}

}

class BankAccount {
	private String ownerName ;
	private double balance ;
	
	public BankAccount(String ownerName, double initialBalance) {
		this.ownerName = ownerName ;
		this.balance = initialBalance ;
	}
	
	public void deposit(double amount) {
		balance += amount ;
	}
	
	public void displaySummary() {
		System.out.println( "Owner:" + ownerName ) ;
		System.out.println("Balance:" + balance ) ;
	}
	
}