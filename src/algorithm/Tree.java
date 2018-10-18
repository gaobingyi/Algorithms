package algorithm;

public class Tree {
	
	/**
	 * 判断两棵树是否相等
	 * LeetCode：100. Same Tree
	 * URL：https://leetcode.com/problems/same-tree/
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if ((p == null && q != null) || (p != null && q == null)) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
	
	/**
	 * 翻转二叉树
	 * LeetCode：226. Inverse Binary Tree
	 * URL：https://leetcode.com/problems/invert-binary-tree/
	 * @param root
	 * @return
	 */
	public TreeNode invertTree(TreeNode root) {
        if (root == null) {
        	return null;
        }
        if (root.left == null && root.right == null) {
        	return root;
        }
    	// 交换左子树和右子树
    	TreeNode node = root.left;
    	root.left = root.right;
    	root.right = node;
        if (root.left != null) {
        	// 翻转左子树
        	invertTree(root.left);
        }
        if (root.right != null) {
        	// 翻转右子树
        	invertTree(root.right);
        }
        return root; 
    }
	 
}
