//https://leetcode.com/problems/is-subsequence/
class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length()>t.length())
            return false;

        int i=0,j=0;
        int n=s.length(),m=t.length();
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(j==m && i<n)
            return false;

        return true;
    }
}

//Different Approaches 
class Solution {
    public boolean isSubsequence(String s, String t) {
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        int i=0,j=0;
        int n=s.length(),m=t.length();
        while(i<n && j<m){
            if(ch1[i]==ch2[j]){
                i++;
            }
            j++;
        }

        return i==n;
    }
}
