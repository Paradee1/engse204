package Lab4_5;

import java.util.Scanner;

public class Lab4_5 {

	public static void main(String[] args) {
		Scanner fd = new Scanner(System.in);
		
		int R = fd.nextInt();
		int G = fd.nextInt();
		int B = fd.nextInt();

		Color rgb = new Color(R, G, B);
		
		rgb.displayRGB();
		
		fd.close();
	}

}

class Color {
	private int red;
	private int green;
	private int blue;
	
	public Color(int r, int g, int b) {
		
		//red
		if(r < 0) {
			this.red = 0;
		}
		else if(r > 255) {
			this.red = 255;
		}
		else {
			this.red = r;
		}
		
		//green
		if(g < 0) {
			this.green = 0;
		}
		else if(g > 255) {
			this.green = 255;
		}
		else {
			this.green = g;
		}
		
		//blue
		if(b < 0) {
			this.blue = 0;
		}
		else if(b > 255) {
			this.blue = 255;
		}
		else {
			this.blue = b;
		}
		
	}
	
	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
	public void displayRGB() {
		System.out.println("R= " + red + ", G= " + green + ", B= " + blue);
	}
	
}