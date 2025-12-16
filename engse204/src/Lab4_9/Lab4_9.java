package Lab4_9;

import java.util.Scanner;

public class Lab4_9 {

	public static void main(String[] args) {
		Scanner yh = new Scanner(System.in);
		
		String ID = yh.nextLine();
		double startbalance = yh.nextDouble();
		double depositAmount = yh.nextDouble();
		double withdrawAmount = yh.nextDouble();
		
		ImmutableAccount acc1 = new ImmutableAccount(ID, startbalance);
		ImmutableAccount acc2 = acc1.deposit(depositAmount);
		ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);
		
		acc1.displayInfo();
		acc3.displayInfo();
		
		
	}

}

class ImmutableAccount {
	private final String accountId;
	private final double balance;
	
	public ImmutableAccount(String accountId, double balance) {
		this.accountId = accountId;
		if(balance < 0.0) {
			this.balance = 0.0;
		}
		
		else {
			this.balance = balance;
		}
	}
	
	public ImmutableAccount(ImmutableAccount other) {
		this.accountId = other.accountId;
		this.balance = other.balance;
	}
	
	public String getAccountId() {
		return accountId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void displayInfo() {
		System.out.println("ID: " + accountId + ", Balance: " + balance);
	}
	
	public ImmutableAccount deposit(double amount) {
		if(amount > 0) {
			return new ImmutableAccount(accountId, balance + amount);
		}
		else {
			System.out.println("Invalid deposit amount.");
			return this;
		}
	}
	
	public ImmutableAccount withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid withdrawal amount.");
			return this;
		}
		else if(amount > balance) {
			System.out.println("Insufficient funds.");
			return this;
		}
		else {
			return new ImmutableAccount(accountId, balance - amount);
		}
	}
}