//https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
        String st[]=s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i =st.length-1;i>=0;i--){
            sb.append(st[i]).append(" ");
        }

        return sb.toString().trim();

    }
}
