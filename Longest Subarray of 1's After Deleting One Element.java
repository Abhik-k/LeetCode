//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
class Solution {
    public int longestSubarray(int[] nums) {
        int k=1,zero=0;
        int i=0,j=0,maxLen=0;

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
            if(zero == k){
                maxLen=Math.max(maxLen,(j-i));
            }
            else if(zero==0){
                maxLen = j-i;
            }
            j++;
        }
        return maxLen;
    }
}
