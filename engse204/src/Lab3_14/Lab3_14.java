package Lab3_14;

import java.util.Scanner;

public class Lab3_14 {

	public static void main(String[] args) {
		
		Scanner mn = new Scanner(System.in);
		
		BankAccount myAccount = null;
		
		int N = mn.nextInt();
		mn.nextLine();
		
		for(int i = 0 ; i < N ; i++) {
			String order = mn.nextLine();
			if(order.equals("CREATE")) {
				double start = mn.nextDouble();
				mn.nextLine();
				
				myAccount = new BankAccount(start);
			}
			else if(order.equals("DEPOSIT")) {
				double Amount = mn.nextDouble();
				mn.nextLine();
				
				if(myAccount == null) {
					System.out.println("No account exists.");
				}
				else {
					myAccount.deposit(Amount);
				}
			}
			
			else if(order.equals("WITHDRAW")) {
				double Amount = mn.nextDouble();
				mn.nextLine();
				
				if(myAccount == null) {
					System.out.println("No account exists.");
				}
				else {
					myAccount.withdraw(Amount);
				}
			}
			
			else if(order.equals("STATUS")) {
				if(myAccount == null) {
					System.out.println("No account exists.");
				}
				else {
					System.out.println("Balance: [" + myAccount.getBalance() + "]");
				}
			}
			
			else if(order.equals("GLOBAL_STATUS")) {
				System.out.println("Total Transaction: [" + BankAccount.getTotalTransactiionCount() + "]");
			}
		}

	}

}

class BankAccount {
	
	private double balance;
	private static int totalTransactionCount = 0;
	
	public BankAccount(double intialDeposit) {
		
		if(intialDeposit >= 0) {
			this.balance = intialDeposit;
			System.out.println("Account created.");
		}
		else {
			this.balance = 0;
		}
	}
	
	public void deposit(double amount) {
		
		if(amount > 0) {
			balance += amount;
			totalTransactionCount++;
			System.out.println("Deposit successful.");
		}
		else {
			System.out.println("Invalid amount.");
		}
	}

	public void withdraw(double amount) {
		
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			totalTransactionCount++;
			System.out.println("Withdrawal successful.");
		}
		else if(amount > balance) {
			System.out.println("Insufficient funds.");
		}
		else {
			System.out.println("Invalid amount.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static int getTotalTransactiionCount() {
		return totalTransactionCount;
	}
}