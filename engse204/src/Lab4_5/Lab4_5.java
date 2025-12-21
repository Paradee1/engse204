package Lab4_5;

import java.util.Scanner;

public class Lab4_5 {

    public static void main(String[] args) {

        // Scanner used for reading RGB values from user input
        Scanner scanner = new Scanner(System.in);

        // Read RGB values
        int redValue = scanner.nextInt();
        int greenValue = scanner.nextInt();
        int blueValue = scanner.nextInt();

        // Create Color object with validated RGB values
        Color rgbColor = new Color(redValue, greenValue, blueValue);

        // Display RGB result
        rgbColor.displayRGB();

        scanner.close();
    }
}

class Color {

    private int red;
    private int green;
    private int blue;

    public Color(int redValue, int greenValue, int blueValue) {

        // Ensure red value is within valid RGB range (0–255)
        if (redValue < 0) {
            this.red = 0;
        } else if (redValue > 255) {
            this.red = 255;
        } else {
            this.red = redValue;
        }

        // Ensure green value is within valid RGB range (0–255)
        if (greenValue < 0) {
            this.green = 0;
        } else if (greenValue > 255) {
            this.green = 255;
        } else {
            this.green = greenValue;
        }

        // Ensure blue value is within valid RGB range (0–255)
        if (blueValue < 0) {
            this.blue = 0;
        } else if (blueValue > 255) {
            this.blue = 255;
        } else {
            this.blue = blueValue;
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

    // Display RGB values in required format
    public void displayRGB() {
        System.out.println("R= " + red + ", G= " + green + ", B= " + blue);
    }
}
