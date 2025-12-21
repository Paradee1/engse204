package Lab4_11;

import java.util.Scanner;

public class Lab4_11 {

	public static void main(String[] args) {
		Scanner fd = new Scanner(System.in);
		
		String BaseTheme = fd.nextLine();
		int BaseFontsize = fd.nextInt();
		boolean BaseDarkmode = fd.nextBoolean();
		fd.nextLine();
		
		String UserTheme = fd.nextLine();
		int UserFontsize = fd.nextInt();
		boolean UserDarkmode = fd.nextBoolean();

		Configuration baseConfig = new Configuration(BaseTheme, BaseFontsize, BaseDarkmode);
		Configuration userConfig = new Configuration(UserTheme, UserFontsize, UserDarkmode);
		
		Configuration fianlConfig = new Configuration(baseConfig, userConfig);
		
		fianlConfig.displaySetting();
		fd.close();
	}

}

class Configuration {
	private String theme;
	private int fontSize;
	private boolean darkMode;
	
	// main Constructor
	public Configuration(String theme, int fontSize, boolean darkMode) {
		if(fontSize < 10) {
			this.fontSize = 10;
		}
		else if(fontSize > 20) {
			this.fontSize = 20;
		}
		else {
			this.fontSize = fontSize;
		}
		
		this.theme = theme;
		this.darkMode = darkMode;
	}
	
	// Merge Constructor
	public Configuration(Configuration base, Configuration user) {
		this.theme = user.theme;
		this.darkMode = user.darkMode;
		this.fontSize = base.fontSize;
	}
	
	public void displaySetting() {
		System.out.println("Theme:" + theme + ", Size:" + fontSize + ", Dark:" + darkMode);
	}
}