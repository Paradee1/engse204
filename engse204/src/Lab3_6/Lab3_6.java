package Lab3_6;

import java.util.Scanner;

public class Lab3_6 {

	public static void main(String[] rgs) {
		Scanner ba = new Scanner(System.in);
		
		double startAmount = ba.nextDouble();
		double depositAmount = ba.nextDouble();
		double withdrawAmount = ba.nextDouble();
		
		BankAccount bk = new BankAccount(startAmount);
		
		System.out.println("--------------------------------");
		
		bk.deposition(depositAmount);
		bk.withdraw(withdrawAmount);
		
		System.out.println("Final Balance:" + bk.getBalance());
	}

}

class BankAccount {
	private double balance;
	
	public BankAccount(double intialBalance) {
		
		if(intialBalance >= 0) {
			this.balance=intialBalance;
		}
		else {
			this.balance = 0;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposition(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposit successful.");
		}
		else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful.");
		}
		else if(amount > balance) {
			System.out.println("Insufficient funds.");
		}
		else {
			System.out.println("Invalid withdrawal amount.");
		}
		
	}
}