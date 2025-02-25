//https://leetcode.com/problems/unique-number-of-occurrences/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        Set<Integer> keys = map.keySet();
        Set<Integer> values = new HashSet<>();
        for(int key : keys){
            int value = map.get(key);
            if(values.contains(value))
                return false;
            
            values.add(value);
        }

        return true;
    }
}
