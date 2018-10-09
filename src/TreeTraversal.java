import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {
	/**
	 * 先序遍历
	 * LeetCode：144. Binary Tree Preorder Traversal
	 * URL：https://leetcode.com/problems/binary-tree-preorder-traversal/
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> resList = new ArrayList<>();
		preorderTraversal(root, resList);
		return resList;
	}
	private void preorderTraversal(TreeNode root, List<Integer> resList) {
		if (root == null) {
			return;
		}
		resList.add(root.val);
		preorderTraversal(root.left, resList);
		preorderTraversal(root.right, resList);
	}
	
	/**
	 * 中序遍历
	 * LeetCode：94. Binary Tree Inorder Traversal
	 * URL：https://leetcode.com/problems/binary-tree-inorder-traversal/
	 * @param root
	 * @return
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        inorderTraversal(root, resList);
        return resList;
    }
	private void inorderTraversal(TreeNode root, List<Integer> resList) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left, resList);
		resList.add(root.val);
		inorderTraversal(root.right, resList);
	}
	
	/**
	 * 后序遍历
	 * LeetCode：145. Binary Tree Postorder Traversal
	 * URL：https://leetcode.com/problems/binary-tree-postorder-traversal/
	 * @param root
	 * @return
	 */
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> resList = new ArrayList<>();
		postorderTraversal(root, resList);
		return resList;
	}
	private void postorderTraversal(TreeNode root, List<Integer> resList) {
		if (root == null) {
			return;
		}
		postorderTraversal(root.left, resList);
		postorderTraversal(root.right, resList);
		resList.add(root.val);
	}
	
	/**
	 * 层序遍历
	 * 剑指Offer：从上往下打印二叉树
	 * URL：https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&tqId=11175&tPage=2&rp=2&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
	 * @param root
	 * @return
	 */
	public List<Integer> levelorderTraversal(TreeNode root) {
		List<Integer> resList = new ArrayList<>();
		if (root == null) {
			return resList;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			resList.add(node.val);
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		return resList;
	}
	
}
