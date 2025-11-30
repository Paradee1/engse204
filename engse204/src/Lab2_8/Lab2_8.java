package Lab2_8;

import java.util.Scanner;

public class Lab2_8 {

	public static void main(String[] rgs) {
		Scanner cf = new Scanner(System.in) ;
		
		System.out.print( "Mode:" ) ;
		String mode = cf.nextLine() ;
		
		System.out.print( "Temperature:" ) ;
		double temp = cf.nextDouble() ;
		
		if( mode.equals( "C_TO_F" )) {
			double result = TempConverter.celsiusToFahrenheit(temp) ;
			System.out.println(result) ;
		}
		else if( mode.equals( "F_TO_C" )) {
			double result = TempConverter.fahrenheitToCelsius(temp) ;
			System.out.println(result) ;
		}

		cf.close() ;
	}

}

class TempConverter {
	
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9.0 / 5.0) + 32 ;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5.0 / 9.0 ;
	}
}