import java.util.*;

public class WaterGrid {

	public static void traversal(char[][] grid, boolean[][] visited, int i, int j) {
		int[] x = {-1, 0, 0, 1};
		int[] y = {0, 1, -1, 0};

		visited[i][j] = true;
		// System.out.println("i: "+i+", j: "+j);

		for(int k = 0; k < x.length; k++) {
			// if(k == 3) {
			// 	System.out.println("here");
			// }
			int xi = i+x[k], yj = j+y[k];
			if(xi >= 0 && xi < grid.length) {
				if(yj >= 0 && yj < grid[0].length) {
					if(!visited[xi][yj]) {
						traversal(grid, visited, xi, yj);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		//forming the input
		Scanner s = new Scanner(System.in);
		int M = s.nextInt(), N = s.nextInt();	

 		char[][] grid = new char[M][N];
 		boolean[][] visited = new boolean[M][N]; //visited array

		for(int i = 0; i < M; i++) {
			String nth = s.next();
			for(int j = 0; j < N; j++) {
				grid[i][j] = nth.charAt(j);
				if(grid[i][j] == '*') {
					visited[i][j] = true; //marking all '*' nodes i.e. buildings as visited
				}
			}
		}

		//traversal of the grid to find trapped units of water
		/*
		 * We are traversing the grid from all open ends i.e. from all the places that the water can flow out.
		 * Whichever nodes we can reach from these open ends, cannot hold water as water will flow out from the open ends along the boundary.
		 * Whichever nodes we cannot reach, are trapped by buildings. Therefore, they can hold water.
		 */
		for(int i = 0; i < 2; i++) {
			i = i*(M-1);
			for(int j = 0; j < N; j++) {
				if(!visited[i][j])
					traversal(grid, visited, i, j); //calling traversal method on unvisited horizontal boundary nodes
			}
		}
		for(int j = 0; j < 2; j++) {
			j = j*(N-1);
			for(int i = 0; i < M; i++) {
				if(!visited[i][j])
					traversal(grid, visited, i, j); //calling traversal method on unvisited vertical boundary nodes
			}
		}

		//output
		int count = 0; //represents units of water trapped
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j])
					count++; //count increases when we find an unvisited node in the final visited status of the grid after traversal
			}
		}

		System.out.println(count);
	}
}