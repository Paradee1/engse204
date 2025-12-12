package Lab3_5;

import java.util.Scanner;

public class Lab3_5 {

	public static void main(String[] rgs) {
		Scanner dc = new Scanner(System.in);
		
		String connectString = dc.nextLine();
		DatabaseConnection tn = new DatabaseConnection(connectString);
		
		System.out.println("-----------------------------");
		
		tn.connect();
		tn.disconnect();
		tn.disconnect();
		System.out.println(tn.isConnected());
	}

}

class DatabaseConnection {
	private String connectionString;
	private boolean connected;
	
	public DatabaseConnection(String connectionString) {
		this.connectionString = connectionString;
		connected = false;
	}
	
	public boolean isConnected() {
		return connected;
	}
	
	public void connect() {
		if(connected == false) {
			connected = true;
			System.out.println("Connected to "+connectionString);
		}
		else if(connected == true) {
			System.out.println("Already connected.");
		}
	}
	
	public void disconnect() {
		if(connected == true) {
			connected = false;
			System.out.println("Disconnected.");
		}
		else if(connected == false) {
			System.out.println("Already disconnected.");
		}
	}
}