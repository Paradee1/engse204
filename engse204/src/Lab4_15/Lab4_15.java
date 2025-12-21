package Lab4_15;

import java.util.Scanner;

public class Lab4_15 {

	public static void main(String[] args) {
		Scanner kl = new Scanner(System.in);
		
		// รับค่า max
		int max = kl.nextInt();
		kl.nextLine();
		
		AuditRecord.setPolicy(max);
		
		String Username = kl.nextLine();
		
		// รับจำนวนคำสั่ง LOG
		int N = kl.nextInt();
		kl.nextLine();
		
		AuditRecord ad = new AuditRecord(Username);
		
		for(int i = 0; i < N; i++) {
			
			// รับข้อความ Log
			String Logs = kl.nextLine();
			
			if(Logs.equals("SET_POLICY")) {
				int newmax = kl.nextInt();
				kl.nextLine();
				
				AuditRecord.setPolicy(newmax);
			}
			else {
				ad = ad.addMessages(Logs);
			}
			
		}
		
		ad.displayLog();
		kl.close();
	}

}

class AuditRecord {
	private final String user;
	private final String[] logMessages;
	private static int maxMessages = 3;
	
	// Simple Constructor
	public AuditRecord(String user) {
		this(user, new String[0]);
	}
	
	// Main Constructor
	public AuditRecord(String user, String[] logs) {
		this.user = user;
		if(logs.length > maxMessages) {
			this.logMessages = new String[maxMessages];
			for(int i = 0; i < maxMessages; i++) {
				this.logMessages[i] = logs[logs.length - maxMessages + i];
			}
		}
		else {
			this.logMessages = new String[logs.length];
			for(int i = 0; i < logs.length; i++) {
				this.logMessages[i] = logs[i];
			}
		}
	}
	
	// Static Setter
	public static void setPolicy(int max) {
		if(max > 0) {
			maxMessages = max;
			System.out.println("Policy set to " + maxMessages);
		}
		else {
			System.out.println("Invalid policy.");
		}
	}
	
	// Immutable Action
	public AuditRecord addMessages(String message) {
	    if (this.logMessages.length >= maxMessages) {
	        System.out.println("Log is full.");
	        return this;
	    }

	    String[] newLogs = new String[this.logMessages.length + 1];

	    for (int i = 0; i < this.logMessages.length; i++) {
	        newLogs[i] = this.logMessages[i];
	    }

	    newLogs[newLogs.length - 1] = message;

	    System.out.println(message + " added.");
	    return new AuditRecord(this.user, newLogs);
	}
	
	public void displayLog() {
		System.out.print("User: " + user);
		System.out.print(", Logs: " + logMessages.length + " [");
		
		for(int i = 0; i < logMessages.length; i++) {
			System.out.print(logMessages[i]);
			
			if(i < logMessages.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}