
/**
 * Complexity : O(n)
 * 
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class MaximumDepthOfBinaryTree {

	int leftSubtreeHeight = 0;
	int rightSubtreeHeight = 0;

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		} else {
			int leftSubtreeHeight = maxDepth(root.left);
			int rightSubtreeHeight = maxDepth(root.right);
			if (leftSubtreeHeight > rightSubtreeHeight) {
				return ++leftSubtreeHeight;
			} else {
				return ++rightSubtreeHeight;
			}
		}
	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		// root.right.left.left = new TreeNode(7);

		MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
		System.out.print(obj.maxDepth(root));
	}
}
