package engse204;

import java.util.Scanner;

public class Minesweeper {

	public static void main(String[] rgs) {
        Scanner mi = new Scanner(System.in);

        int r = mi.nextInt();
        int c = mi.nextInt();

        char[][] map = new char[r][c];

        for (int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                map[i][j] = mi.next().charAt(0);
            }
        }

        int targetR = mi.nextInt();
        int targetC = mi.nextInt();

        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
            return;
        }

        int count = 0;

        int[] dR = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dC = {-1,  0,  1, -1, 1, -1, 0, 1};

        for (int k = 0; k < 8; k++) {
            int nr = targetR + dR[k];
            int nc = targetC + dC[k];

            if (nr >= 0 && nr < r && nc >= 0 && nc < c) {
                if (map[nr][nc] == '*') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
