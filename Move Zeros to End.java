//https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    i++;
            }
        }
        return;
    }
}

// Different Approach 
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                if(nums[i]==0){
                    nums[i]=nums[j];
                    nums[j]=0;
                }
                i++;
            }
        }
        return;
    }
}
