import java.util.*;
import java.io.*;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Steven{
	public static void solve(List<Integer> res, TreeNode root){
		if(root == null) return;

		solve(res, root.left);
		res.add(root.val);
		solve(res, root.right);
	}

	public static List<Integer> inorderTraversal(TreeNode root){
		List<Integer> res = new ArrayList<>();
		solve(res, root);

		return res;
	}

	public static void main(String[] args) throws Exception{
		TreeNode root = new TreeNode(1);
		
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		List<Integer> res = inorderTraversal(root);
		for(int i = 0 ; i < res.size() ; i++){
			System.out.print(res.get(i) + " ");
		}
	}
}
