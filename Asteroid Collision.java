//https://leetcode.com/problems/asteroid-collision/
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ele : asteroids){
            if(ele>0){
                st.push(ele);
            }
            else{
                while(!st.isEmpty() && st.peek()>0
                && st.peek()<Math.abs(ele)){
                    st.pop();
                }
                if(!st.isEmpty()&&(st.peek()+ele == 0)){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(ele);
                }
            }    
        }
        int[] array = st.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
