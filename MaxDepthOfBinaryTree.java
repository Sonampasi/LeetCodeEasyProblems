import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxDepthOfBinaryTree {

	public int maxDepthUsingDfs(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode current = null;
		TreeNode prev = null;
		int max = 0;
		if(root==null){
		    return max;
		}
		s.push(root);
		int depth = 0;
		while(!s.isEmpty()){
			current = s.peek();
			if(current.left!=null&&prev==current.left){
				if(current.right!=null){
					s.push(current.right);
				}else{
					prev=s.pop();
				}
			}else if(current.right!=null&&prev==current.right){			
					prev=s.pop();
			}else if(current.left!=null){
				s.push(current.left);
			}else if(current.right!=null){
				s.push(current.right);
			}else{
				depth = s.size();
				max=Math.max(max,depth);
				prev=s.pop();
			}
		}
		return max;
	}
	
	public int maxDepthUsingBfs(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int level = 1;
		if(root == null){
			return 0;
		}
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			TreeNode temp = q.remove();
			if(temp==null){
				if(q.isEmpty()){
					break;
				}
				q.add(null);
				level = level+1;
			}else{
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);	
				}
			}
		}
		return level;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		//root.left.left.right = new TreeNode(8);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
	    //root.right.left.left = new TreeNode(7);
		MaxDepthOfBinaryTree obj = new MaxDepthOfBinaryTree();
		//System.out.print(obj.maxDepthUsingDfs(root));
		System.out.println(obj.maxDepthUsingBfs(root));
	}

}
