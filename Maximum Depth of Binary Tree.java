//https://leetcode.com/problems/maximum-depth-of-binary-tree/
class Solution {
    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    public int depth(TreeNode root){
        if(root == null)
            return 0;

        return 1+Math.max(depth(root.left),depth(root.right));
    }

}
