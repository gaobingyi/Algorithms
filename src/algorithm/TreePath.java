package algorithm;
import java.util.ArrayList;
import java.util.List;

public class TreePath {	
	
	/**
	 * 获得二叉树的所有路径
	 * @param root
	 * @return
	 */
	public List<List<Integer>> allPath(TreeNode root) {
	    List<List<Integer>> paths = new ArrayList<>();
	    List<Integer> path = new ArrayList<>();
	    helper(root, path, paths);
	    return paths;
	}
	
	/**
	 * allPath的辅助函数
	 * @param root
	 * @param path 存储某一条路径
	 * @param paths 存储所有路径
	 */
	private void helper(TreeNode root, List<Integer> path, List<List<Integer>> paths) {
	    if (root == null)
	        return;
	    path.add(root.val);
	    if (root.left == null && root.right == null) {
	    	paths.add(new ArrayList<Integer>(path));
	    }
	    helper(root.left, path, paths);
	    helper(root.right, path, paths);
	    path.remove(path.size()-1); // 回溯
	}
	
/* ---------------------------------------------------------------------------------- */
	
	/**
	 * LeetCode: 257. Binary Tree Paths
	 * URL: https://leetcode.com/problems/binary-tree-paths/
	 * @param root
	 * @return
	 */
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new ArrayList<>();
		StringBuilder path = new StringBuilder();
		helper2(root, path, paths);
		return paths;
    }
	
	private void helper2(TreeNode root, StringBuilder path, List<String> paths) {
		if (root == null)
			return;
		String temp = String.valueOf(root.val);
		int len = temp.length();
		path.append(temp).append("->");
		if (root.left == null && root.right == null) {
			paths.add(path.substring(0, path.length() - 2));
		}
		helper2(root.left, path, paths);
		helper2(root.right, path, paths);
		path.delete(path.length() - len - 2, path.length()); // 回溯
	}
	
/* ---------------------------------------------------------------------------------- */
	
	/**
	 * 剑指Offer：二叉树中和为某一值的路径
	 * URL：https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca?tpId=13&tqId=11177&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
	 * @param root
	 * @param target
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
	    ArrayList<Integer> path = new ArrayList<>();
	    helper3(root, target, path, paths);
	    return paths;
    }
	
	private void helper3(TreeNode root, int target, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> paths) {
	    if (root == null)
	        return;
	    path.add(root.val);
	    target -= root.val;
	    if (root.left == null && root.right == null) {
	    	if (target == 0) {
	    		paths.add(new ArrayList<Integer>(path));
	    	}
	    }
	    helper3(root.left, target, path, paths);
	    helper3(root.right, target, path, paths);
	    // 回溯
	    path.remove(path.size()-1); 
	    target += root.val;
	}
	
/* ---------------------------------------------------------------------------------- */
	
	/**
	 * LeetCode: 112. Path Sum
	 * URL：https://leetcode.com/problems/path-sum/
	 * @param root
	 * @param sum
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		sum -= root.val;
		if (root.left == null && root.right == null) {
			if (sum == 0) {
				return true;
			}
		}
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
