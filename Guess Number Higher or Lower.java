//Easy - Binary Search
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int h = n;

        while(l<=h){
            int mid = l+(h-l)/2;
            int check = guess(mid);
            if(check == -1){
                h = mid;
            }
            else if(check == 1){
                l=mid+1;
            }
            else{
                return mid;
            }
        }

        return 0;
    }
}
