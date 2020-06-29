import java.util.*;

public class LinearCongruentialGenerator {

	public static void main(String[] args) {
		// Scanner s = new Scanner(System.in);
		int a=12, c=25, seed=17, mod=100;
		System.out.println("Generating 10 random numbers : ");
		for(int i = 0; i < 10; i++) {
			seed = (a*seed + c)%mod;
			System.out.println(seed);
		}
	}

}