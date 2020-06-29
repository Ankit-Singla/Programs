public class LinearCongruentialGenerator {

	public static void main(String[] args) {
		int a=2, c=3, seed=4, mod=5;
		System.out.println("Generating 10 random numbers : ")
		for(int i = 0; i < 10; i++) {
			seed = (a*seed + c)%mod;
			System.out.println(seed);
		}
	}

}