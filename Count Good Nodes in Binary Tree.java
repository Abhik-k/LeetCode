//https://leetcode.com/problems/count-good-nodes-in-binary-tree/
class Solution {
    int count=0;

    public int goodNodes(TreeNode root) {
        if(root == null)
            return 0;
        
        check(root,Integer.MIN_VALUE);
        return count;
    }
    public void check(TreeNode root, int max){
        if(root == null)
            return ;

        if(max<=root.val){
            // System.out.println(root.val);
            count++;
            max=root.val;
        }

        check(root.left,max);
        check(root.right,max);

        return;
    }
}
