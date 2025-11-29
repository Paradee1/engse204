package Lab2;

import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);

		System.out.print("Input Name: ");
		String name=cs.nextLine();
		System.out.print("Input MidtermScore: ");	
		int midtermscore=cs.nextInt();
		System.out.print("Input FinalScore: ");
		int finalscore=cs.nextInt();
		
		Studentthree av = new Studentthree(name, midtermscore, finalscore);
		
		av.displaySummary();
	}

}

class Studentthree {
	private String name;
	private int midtermScore;
	private int finalScore;
	
	public Studentthree(String name, int midtermScore, int finalScore) {
		this.name=name;
		this.midtermScore=midtermScore;
		this.finalScore=finalScore;
	}
	
	public double calculateAverage() {
			return (midtermScore + finalScore) / 2.0 ;
		}
		
		public void displaySummary() {
			double averageScore = calculateAverage() ;
			
			System.out.println("Name: "+this.name);
			System.out.println("Average Score: "+averageScore);
			if(averageScore >= 50.0) {
				System.out.println("Status: Pass");
			}
			else {
				System.out.println("Status: Fail");
			}
		}
}
