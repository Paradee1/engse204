package Lab2_7;

import java.util.Scanner;

public class Lab2_7 {

    public static void main(String[] rgs) {
        Scanner su = new Scanner(System.in);

        // รับข้อมูลชื่อ
        System.out.print("Enter OwnerName: ");
        String name = su.nextLine();

        // รับยอดเงินในบัญชี
        System.out.print("Enter InitialBalance: ");
        double balance = su.nextDouble();

        // จำนวนเงินที่จะถอนรอบที่ 1
        System.out.print("Enter WithdrawalAmount 1: ");
        double ws1 = su.nextDouble();

        // จำนวนเงินที่จะถอนรอบที่ 2
        System.out.print("Enter WithdrawalAmount 2: ");
        double ws2 = su.nextDouble();

        BankAccount wi = new BankAccount(name, balance);

        // ทำรายการถอนเงิน
        wi.withdraw(ws1);
        wi.withdraw(ws2);

        // แสดงยอดเงินคงเหลือ
        wi.displayBalance();

        su.close();
    }
}

class BankAccount {

    // Private Instance Attributes
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Method: withdraw(double amount)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method: displayBalance()
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}