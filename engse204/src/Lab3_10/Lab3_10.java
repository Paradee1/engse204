package Lab3_10;

import java.util.Scanner;

public class Lab3_10 {

	public static void main(String[] args) {
		Scanner tn = new Scanner(System.in);
		
		int N = tn.nextInt();
		tn.nextLine();
		
		for(int i = 0 ; i < N ; i++) {
			
			String mode = tn.next();
			
			if(mode.equals("SET")) {
				
				int newlog = tn.nextInt();
				tn.nextLine(); 
				
				SystemLogger.setLogLevel(newlog);
			}
			else if(mode.equals("LOG")) {
				
				int Log = tn.nextInt();
				tn.nextLine();
				
				String message = tn.nextLine();
				
				SystemLogger.log(Log, message);
			}
		}

	}

}

class SystemLogger {
	
	private static int currentLogLevel = 1;
	
	private static String getLevelName(int level) {
		
		switch (level) {
		case 1 : return "INFO";
		case 2 : return "DEBUG";
		case 3 : return "ERROR";
		default : return "UNKNOWN";
		
		}
	}
	
	public static void setLogLevel(int newLevel) {
		
		if(newLevel >= 1 && newLevel <= 3 ) {
			currentLogLevel = newLevel;
			System.out.println("Log Level set to [" + getLevelName(newLevel) + "] ");
		}
		else {
			System.out.println("Invalid log level.");
		}
	}
	
	public static void log(int messageLevel, String message) {
		
		if(messageLevel >= currentLogLevel) {
			String LevelName = getLevelName(messageLevel);
			System.out.println("[" + LevelName + "]" + message);
		}
	}
}
