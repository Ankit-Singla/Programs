import java.util.*;

public class 8PuzzleDFS {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 3;
		int[] init = new int[3][3];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				init[i][j] = s.nextInt();
				if(init[i][j] == -1) {
					index = i*n+j;
				}
			}
		}
	}
}