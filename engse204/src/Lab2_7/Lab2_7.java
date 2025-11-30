package Lab2_7;

import java.util.Scanner;

public class Lab2_7 {

	public static void main(String[] rgs) {
		Scanner su = new Scanner(System.in) ;
		
		String name = su.nextLine() ;
		double balance = su.nextDouble() ;
		double ws1 = su.nextDouble() ;
		double ws2 = su.nextDouble() ;
		
		BankAccount wi = new BankAccount(name, balance) ;
		
		wi.withdraw(ws1) ;
		wi.withdraw(ws2) ;
		
		wi.displayBalance() ;

		su.close();
	}

}

class BankAccount {
	
	private String ownerName ;
	private double balance ;
	
	public BankAccount(String ownerName, double initialBalance) {
		this.ownerName = ownerName ;
		this.balance = initialBalance ;
	}
	
	public void withdraw(double amount) {
		
		if(amount <= balance) {
			balance -= amount ;
			System.out.println( "Withdraw successful." ) ;
		}
		else if(amount > balance) {
			System.out.println( "Insufficient funds." ) ;
		}
	}
	
	public void displayBalance() {
		System.out.println( "Balance:" + balance ) ;
	}
}