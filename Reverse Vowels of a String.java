//https://leetcode.com/problems/reverse-vowels-of-a-string/
class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowelSet = new HashSet<>();
        vowelSet = Set.of('a','e','i','o','u','A','E','I','O','U');
        char ch[]=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(vowelSet.contains(ch[i])){
                if(vowelSet.contains(ch[j])){
                    char temp= ch[j];
                    ch[j]=ch[i];
                    ch[i]=temp;

                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else if(vowelSet.contains(ch[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
        }


        return new String(ch);
    }
}
