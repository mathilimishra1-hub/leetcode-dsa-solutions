link:-http://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;      // add 1
                return digits;    // no carry needed
            }
            
            digits[i] = 0; // if digit is 9, make it 0 and continue carry
        }
        
        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
