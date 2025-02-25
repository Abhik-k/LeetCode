//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
class Solution {
    public int maxVowels(String s, int k) {
        int vc=0,x=0,mvc=0;
        char ch[] =s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        int i=0,j=0;
        while(j<s.length()){
            char c=ch[j];
            x++;
            if(set.contains(c)){
                vc++;
            }
            if(x>k){
                if(set.contains(ch[i])){
                    vc--;
                }
                i++;
                x--;
            }
            if(x==k){
                mvc=Math.max(mvc,vc);
            }
            j++;
        }
        return mvc;
    }
}
