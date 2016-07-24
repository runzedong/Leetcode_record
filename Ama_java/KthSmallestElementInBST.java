public class KthSmallestElementInBST {
	//method 1. apply inorder traversal and return kth element
    public int kthSmallest1(TreeNode root, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(res, root, k);
        return res.get(k-1);
    }
    
    public void helper(ArrayList<Integer> res, TreeNode root, int k) {
        if (root == null)
            return ;
        if (k == 0)
            return ;
        helper(res, root.left, k);
        res.add(root.val);
        k--;
        helper(res, root.right, k);
    }
    //method 2. still inorde traversal, but with stack to halt loop upon meeting k elements
    public int kthSmallest2(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        int result = 0;
        while (k != 0) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            else {
                root = stack.pop();
                k--;
                result = root.val;
                root = root.right;
            }
        }
        return result;
    }
    
}