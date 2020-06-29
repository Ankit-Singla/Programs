import java.util.*;

public class DivideArray {

		public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("What's the array size?");
				int n = s.nextInt();

				System.out.println("Please provide the "+n+" elements.");
				int[] arr = new int[n];
				for(int i = 0; i < n; i++) {
						arr[i] = s.nextInt();
				}

				System.out.println("Enter k:");
				int k = s.nextInt();

				divideArrayIntoSubsets(arr, k);
		}

		public static void divideArrayIntoSubsets(int[] arr, int k) {
				int sum = 0;
				for(int el: arr) {
						sum += el;
				}
				if(sum % k != 0) {
						return;
				}

				int x = sum/k;

				ArrayList<ArrayList<Integer>> output = new ArrayList<>();
				for(int i = 0; i < x; i++) {
						output.add(new ArrayList<>());
				}

				helper(arr, k, 0, output);
		}

		public static void helper(int[] arr, int k, int index, ArrayList<ArrayList<Integer>> output) {
				// base case
				if(index >= arr.length) {
						int numElems = 0;
						for(int i = 0; i < output.size(); i++) {
								ArrayList<Integer> list = output.get(i);
								int sum = 0;
								for(int el: list) {
										sum += el;
								}
								if(sum != k) {
										return;
								}

								numElems += list.size();
						}
						if(numElems == arr.length) {
								System.out.println();
								System.out.println("Output!");
								print(output);
						}

						return;
				}

				int el = arr[index];
				for(int i = 0; i < output.size(); i++) {
						ArrayList<ArrayList<Integer>> newOutput = new ArrayList<>(output);
						newOutput.get(i).add(el);
						helper(arr, k, index+1, newOutput);
						output.get(i).remove(output.get(i).size()-1);
				}
		}

		public static void print(ArrayList<ArrayList<Integer>> output) {
				for(int i = 0; i < output.size(); i++) {
						ArrayList<Integer> list = output.get(i);
						System.out.print("[ ");
						for(int el: list) {
								System.out.print(el+" ");
						}
						System.out.println("]");
				}
		}
}