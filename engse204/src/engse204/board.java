package engse204;

import java.util.Scanner;

public class board {

	public static void main(String[] rgs) {
		Scanner db=new Scanner(System.in);

		int R = db.nextInt();
		int C = db.nextInt();

		int[][] grid = new int[R][C];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				grid[i][j] = db.nextInt();
	            }
	        }

		int onlineCount = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (grid[i][j] == 1) {
					onlineCount++;
	                }
	            }
	        }
		System.out.println(onlineCount);
		
	}

}
