//https://leetcode.com/problems/find-the-highest-altitude/
class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int maxAlt = 0;
        for(int ele : gain){
            start+=ele;
            maxAlt = Math.max(maxAlt,start);
        }
        return maxAlt;
    }
}
