package Lab4_14;

import java.util.Scanner;

public class Lab4_14 {

	public static void main(String[] args) {
		Scanner gh = new Scanner(System.in);
		
		String GameName = gh.nextLine();

		int[] originalScores = new int[3];
		
		for(int i = 0; i < 3; i++) {
			originalScores[i] = gh.nextInt();
		}
		
		ScoreBoard sb1 = new ScoreBoard(GameName, originalScores);
		ScoreBoard sb2 = new ScoreBoard(sb1);
		
		int newScore = gh.nextInt();
		originalScores[0] = newScore;
		
		sb1.displayScores();
		sb2.displayScores();
		
		gh.close();
	}

}

class ScoreBoard {
	private String gameName;
	private int[] scores;
	
	public ScoreBoard(String gameName, int[] scores) {
		this.gameName = gameName;
		this.scores = scores;
	}
	
	public ScoreBoard(ScoreBoard other) {
		this.gameName = other.gameName;
		this.scores = new int[other.scores.length];
		
		for(int i = 0; i < other.scores.length; i++) {
			this.scores[i] = other.scores[i]; 
		}
	}
	
	public void displayScores() {
		System.out.print(gameName + ": ");
		for(int i = 0 ; i < scores.length; i++) {
			System.out.print(scores[i]);
			if(i < scores.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("");
	}
}