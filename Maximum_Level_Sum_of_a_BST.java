//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
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
    Map<Integer,Integer> map = new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        traversal(root,1);
        int maxRes=Integer.MIN_VALUE,key=0;
        Set<Integer> keys = map.keySet();
        for(int ele : keys){
            if(map.get(ele)>maxRes){
                key=ele;
                maxRes=map.get(ele);
            }
        }
        return key;
    }
    public void traversal(TreeNode root,int level){
        if(root == null)
            return;

        if(map.get(level)!=null){
            int value = map.get(level);
            value+=root.val;
            map.put(level,value);
        }else{
            map.put(level,root.val);
        }
        traversal(root.left,level+1);
        traversal(root.right,level+1);

        return;
    }
}
