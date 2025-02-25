//https://leetcode.com/problems/find-the-difference-of-two-arrays/
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        //0 - Common n1 in n2
        //1 - Different n2 not in n1

        for(int ele : nums1){
            s1.add(ele);
        }

        for(int ele : nums2){
            s2.add(ele);
        }

        List<Integer> common =new ArrayList<>();
        for(int ele : s2){
            if(!s1.contains(ele)){
                common.add(ele);
            }
        }

        List<Integer> different =new ArrayList<>();
        for(int ele : s1){
            if(!s2.contains(ele)){
                different.add(ele);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(different));
        answer.add(new ArrayList<>(common));

        return answer;
    }

}
