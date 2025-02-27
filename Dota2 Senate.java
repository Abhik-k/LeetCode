//https://leetcode.com/problems/dota2-senate/
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for(int i=0;i<senate.length();i++){
            char ch = senate.charAt(i);
            if(ch=='R'){
                radiant.add(i);
            }
            else{
                dire.add(i);
            }
        }

        int n = senate.length(); //Offest

        while(!radiant.isEmpty() && !dire.isEmpty()){
            int r = radiant.poll();
            int d = dire.poll();

            if(r<d){
                radiant.add(r+n);
            }
            else{
                dire.add(r+n);
            }
        }
        if(radiant.isEmpty()){
            return "Dire";
        }
        else{
            return "Radiant";
        }
    }
}
