package Lab3_2;

import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] rgs) {
		Scanner in = new Scanner(System.in);
		
		int startScore = in.nextInt();

		int updateScoer  = in.nextInt();
		
		Player py = new Player(startScore);
		
		System.out.println("-------------------------");
		
		py.setScore(updateScoer);
		System.out.println(py.getScore());
		
	}

}

class Player {
	private int score;
	
	public Player(int score) {
		this.score =score;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int newScore) {
		score = newScore;
	}
}