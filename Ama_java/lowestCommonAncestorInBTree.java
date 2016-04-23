/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 1. if root is null. return null
 * 2. if left and right both !=null, 
 *    node p and node q must belong left and right subtree respectively
 * 3. if one of Treenode left and right !=null. return it.
 */

public class lowestCommonAncestorInBTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root==null)
            return null;
        if (root==p || root==q)
            return root;
        TreeNode left=lowestCommonAncestor(root.left, p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if (left!=null && right!=null)
            return root;
        else if (left!=null)
            return left;
        else if (right!=null)
            return right;
        else
            return null;
	}
	//there is another condition when TreeNode has parent field
	//For TreeNode p and TreeNode q
	public int getHeight(Treenode node) {
		int height=0;
		while (node!=null){
			height++;
			node=node.parent;
		}
		return height
	}
	// get height of TreeNode and find which one is more deeper
	// 1. we try to make them at the same level. and find ancestor.
	int hp=getHeight(p);
	int hq=getHeight(q);
	TreeNode result=lowestCommonAncestor(p,q,hp,hq);
	public TreeNode lowestCommonAncestorWithParent(TreeNode p, TreeNode q, int hp, int hq) {
		int diff=0;
		if (hp>hq)
		{
			diff=hp-hq;
			for (int i=0; i<diff; i++){
				p=p.parent;
				if (p==q)
					return p;
			}
		}
		else if(hp<hq)
		{
			diff=hq-hp;
			for (int i=0; i<diff; i++){
				q=q.parent;
				if (p==q)
					return q;
			}
		}
		while (p!=null && q!=null)
		{
			p=p.parent;
			q=q.parent;
			if (p=q)
				return p;
		}
		return null;
	}
}