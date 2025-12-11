package Lab3_11;

import java.util.Scanner;

public class Lab3_11 {

	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		
		int N = as.nextInt();
		as.nextLine();
		
		for(int i = 0 ; i < N ; i++) {
			String order = as.nextLine();
			if(order.equals("SET_URL")) {
				String Newurl = as.nextLine();
				
				SystemConfig config = SystemConfig.getInstance();
				config.setServerUrl(Newurl);
				
			}
			else if(order.equals("SET_MAX")) {
				int Newmax = as.nextInt();
				as.nextLine();
				
				SystemConfig config = SystemConfig.getInstance();
				config.setMaxConnections(Newmax);
				
			}
			else if(order.equals("SHOW")) {
				SystemConfig config = SystemConfig.getInstance();
				
				System.out.println("URL :" + config.getServerUrl());
				System.out.println("MAX :" + config.getMaxConnection());
			}
		}

	}

}

class SystemConfig {
	private static SystemConfig  instance;
	
	private String serverUrl;
	private int maxConnection;
	
	private SystemConfig() {
		this.serverUrl = "default.sever.com";
		this.maxConnection = 10;
	}
	
	public static SystemConfig getInstance() {
		if(instance == null) {
			instance = new SystemConfig();
		}
		
		return instance;
	}
	
	//getter
	public String getServerUrl() {
		return serverUrl;
	}
	
	//setter
	public void setServerUrl(String url) {
		this.serverUrl = url;
	}
	
	//getter
	public int getMaxConnection() {
		return maxConnection;
	}
	
	public void setMaxConnections(int count) {
		if(count > 0) {
			maxConnection = count;
			System.out.println("Max connection set.");
		}
		else {
			System.out.println("Invalid count.");
		}
	}
}