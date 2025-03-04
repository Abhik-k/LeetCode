//https://leetcode.com/problems/path-sum-iii/
class Solution {
    int count =0;
    Map<Long,Integer> map = new HashMap<>();
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        sum(root,targetSum,0);
        return count;
    }
    public void sum(TreeNode root, int total,long currSum){
        if(root == null)
            return;
        // System.out.println(map);
        currSum+=root.val;
        if(currSum == total){
            count++;
        }
        if(map.containsKey(currSum-total)){
            count+=map.get(currSum-total);
        }
        map.put(currSum,map.getOrDefault(currSum,0)+1);
        sum(root.left,total,currSum);
        sum(root.right,total,currSum);
        
        map.put(currSum,map.get(currSum)-1);
        if(map.get(currSum)<=0)
            map.remove(currSum);

        return;
    }
}
