//https://leetcode.com/problems/max-consecutive-ones-iii/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,zero=0;
        int maxLen=0,freq=0;

        while(j<nums.length){
            int val = nums[j];
            if(val == 0){
                zero++;
            }
            if(zero>k){
                if(nums[i]==0){
                    zero--;
                }
                i++;
            }
            if(zero<=k){
                maxLen = Math.max(maxLen,(j-i+1));
            }
            j++;
        }
        return maxLen;
    }
}
