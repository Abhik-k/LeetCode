//https://leetcode.com/problems/find-pivot-index/
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0,rightSum=0;

        int totalSum =0;
        for(int ele : nums){
            totalSum+=ele;
        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                leftSum=0;
            }
            else if(i>0){
                leftSum+=nums[i-1];
            }
            rightSum=totalSum-nums[i]-leftSum;
            if(leftSum == rightSum)
                return i;
        }
        return -1;   
    }
}
