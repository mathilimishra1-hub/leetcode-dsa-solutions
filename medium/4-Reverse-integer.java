link:-https://leetcode.com/problems/reverse-integer/description/

class Solution {
    public int reverse(int x) {
        int i=0;
        while(x!=0){
            int n=x%10;
             x/=10;
            if(i>Integer.MAX_VALUE/10)
            return 0;
            if(i<Integer.MIN_VALUE/10)
            return 0;

            i=i*10+n;
        }
        return i;
    }
}
