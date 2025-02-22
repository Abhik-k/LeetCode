//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // List<Integer> list = new ArrayList<>();
    int count =0;
    int result=0;
    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root,k);
        return result;
    }

    public void inOrderTraversal(TreeNode root,int k){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left,k);

        // list.add(root.val);
        // if(list.size()==k)
        //     return;

        count++;
        if(count==k){
            result=root.val;
            return;
        }
        
        inOrderTraversal(root.right,k);
        return;
    }
}
