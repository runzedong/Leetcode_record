/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean Flag=true;
        while (Flag)
        {
            Flag=false;
            while (p.val>root.val && q.val>root.val){
                root=root.right;
                Flag=true;
            }
            while (p.val<root.val && q.val<root.val){
                root=root.left;
                Flag=true;
            }
        }
        return root;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val>root.val && q.val>root.val)
            return lowestCommonAncestor(root.right, p, q);
        if (p.val<root.val && q.val<root.val)
            return lowestCommonAncestor(root.left, p, q);
        return root;
    }      
}