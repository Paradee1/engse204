package engse204;

import java.util.Scanner;

public class board {

	public static void main(String[] rgs) {
		Scanner br=new Scanner(System.in);

		int r = br.nextInt();
		int c = br.nextInt();

		int[][] grid = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				grid[i][j] = br.nextInt();
	            }
	        }

		int onlinecount = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) {
					onlinecount++;
	                }
	            }
	        }
		System.out.println(onlinecount);
		
	}

}
