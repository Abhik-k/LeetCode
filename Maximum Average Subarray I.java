//https://leetcode.com/problems/maximum-average-subarray-i/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        double val=0.0;
        double maxAvg=Double.NEGATIVE_INFINITY;
        while(j<nums.length){
            val+=nums[j];
            if((j-i+1) > k){
                val-=nums[i];
                i++;
            }
            if(j-i+1 == k){
                double avg = val/k;
                maxAvg = Math.max(avg,maxAvg);
            }
            j++;
        }
        return maxAvg;
    }
}
