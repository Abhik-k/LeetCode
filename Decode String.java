//https://leetcode.com/problems/decode-string/
class Solution {
    public String decodeString(String s) {
     Stack<Integer> numStack = new Stack<>();
     Stack<StringBuilder> stringStack = new Stack<>();
     int currNum = 0;
     StringBuilder currString = new StringBuilder();

     for(char ch : s.toCharArray()){
        if(Character.isDigit(ch)){
            currNum=currNum*10+(ch-'0');
        }
        else if(ch=='['){
            numStack.push(currNum);
            stringStack.push(currString);

            currNum=0;
            currString = new StringBuilder();
        }
        else if(ch==']'){
            int val = numStack.pop();
            StringBuilder prevString = stringStack.pop();

            for(int i=0;i<val;i++){
                prevString.append(currString);
            } 
            currString = prevString;
        }
        else{
            currString.append(ch);
        }
     }
    return currString.toString();

    }
}
