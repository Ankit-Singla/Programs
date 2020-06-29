public class AIinternal {
	
	static int num_alpha_cuts = 0, num_beta_cuts = 0;


	public static void main(String[] args) {
		int[] gametree = {3, 5, 6, 9, 1, 2, 0, -1};
		System.out.println("Optimal value: "+minimax(gametree, 0, 0, true, Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println("Number of alpha cuts: "+num_alpha_cuts);
		System.out.println("Number of beta cuts: "+num_beta_cuts);
	}

	public static int minimax(int[] gametree, int index, int depth, boolean isMaximisingPlayer, int alpha, int beta) {
		if(depth == 3) {
			return gametree[index];
		}

		if(isMaximisingPlayer) {
			int bestval = Integer.MIN_VALUE;
			for(int i = 0; i < 2; i++) {
				int val = minimax(gametree, 2*index+i, depth+1, false, alpha, beta);
				bestval = Math.max(bestval, val);
				alpha = Math.max(alpha, bestval);

				if(beta <= alpha) {
					num_alpha_cuts++;
					break;
				}
			}
			return bestval;
		} else {
			int bestval = Integer.MAX_VALUE;
			for(int i = 0; i < 2; i++) {
				int val = minimax(gametree, 2*index+i, depth+1, true, alpha, beta);
				bestval = Math.min(bestval, val);
				beta = Math.min(bestval, beta);

				if(beta <= alpha) {
					num_beta_cuts++;
					break;
				}
			}
			return bestval;
		}
	}
}