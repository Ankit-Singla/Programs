// inputs - (a, b, c) E (1, 10)
// output - a*b*c

// Robust case testing
import java.util.*;

class Robust {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// take input
		System.out.println("Please provide the number of inputs:");
		int n = s.nextInt(); // number of inputs

		// System.out.println("Please provide the "+n+" inputs:");
		// int inputs[] = new int[n];
		// for(int i = 0; i < n; i++) {
		// 	inputs[i] = s.nextInt();
		// }

		System.out.println("Please provide the input range. Lower bound:");
		int l = s.nextInt(); // lower bound for input domain
		System.out.println("Upper bound:");
		int u = s.nextInt(); // upper bound for input domain

		// processing
		int mean = (u-l+1)/2;
		int boundaryValues[] = new int[]{ l-1, l, l+1, u-1, u, u+1 };

		int tc_id = 1;

		System.out.println("Test Case ID   a    b    c      Expected Output");
		System.out.println("---------------------------------------------------");

		for(int i = 0; i < n; i++) {
			int a = mean, b = mean, c = mean;

			for(int j = 0; j < 6; j++) {
				int el = boundaryValues[j];
				if(i == 0) {
					a = el;
				} else if(i == 1) {
					b = el;
				} else {
					c = el;
				}

				if(tc_id < 10) {
					System.out.println(tc_id+"              "+a+"      "+b+"      "+c+"      "+expectedOutput(a, b, c, l, u));	
				} else {
					System.out.println(tc_id+"             "+a+"      "+b+"      "+c+"      "+expectedOutput(a, b, c, l, u));
				}
				
				tc_id++;
			}
		}
		System.out.println(tc_id+"             "+mean+"      "+mean+"      "+mean+"      "+"      "+expectedOutput(mean, mean, mean, l, u));
		System.out.println("---------------------------------------------------");
	}

	public static String expectedOutput(int a, int b, int c, int l, int u) {
		if(a < l || b < l || c < l || a > u || b > u || c > u) {
			return "Invalid Input";
		}
		return (""+(a*b*c)+"");
	}
}



/* output

Test Case ID   a    b    c      Expected Output
---------------------------------------------------
1              0      5      5      Invalid Input
2              1      5      5      25
3              2      5      5      50
4              9      5      5      225
5              10      5      5      250
6              11      5      5      Invalid Input
7              5      0      5      Invalid Input
8              5      1      5      25
9              5      2      5      50
10             5      9      5      225
11             5      10      5      250
12             5      11      5      Invalid Input
13             5      5      0      Invalid Input
14             5      5      1      25
15             5      5      2      50
16             5      5      9      225
17             5      5      10      250
18             5      5      11      Invalid Input
19             5      5      5            125
---------------------------------------------------

*/