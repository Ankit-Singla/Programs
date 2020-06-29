import java.util.*;

class Tree {
	Tree left;
	Tree right;
	int val;

	public Tree(int val) {
		this.val = val;
	}
}

public class minmax {

	public static void main(String[] args) {
		Tree root = new Tree(-1);
		
		root.left = new Tree(-1);
		root.right = new Tree(-1);

		root.left.left = new Tree(-1);
		root.left.right = new Tree(-1);
		root.right.left = new Tree(-1);
		root.right.right = new Tree(-1);

		root.left.left.left = new Tree(3);
		root.left.left.right = new Tree(5);
		root.left.right.left = new Tree(6);
		root.left.right.right = new Tree(9);
		root.right.left.left = new Tree(-3);
		root.right.left.right = new Tree(-1);
		root.right.right.left = new Tree(0);
		root.right.right.right = new Tree(-5);

		System.out.println(minmaxSearch(root, 0));
	}

	public static int minmaxSearch(Tree root, int level) {
		if(root == null) {
			return -1;
		}
		if(root.val != -1) {
			return root.val;
		}

		if(level%2 == 0) {
			return Math.max(minmaxSearch(root.left, level+1), minmaxSearch(root.right, level+1));
		} else {
			return Math.min(minmaxSearch(root.left, level+1), minmaxSearch(root.right, level+1));
		}
	}

}









