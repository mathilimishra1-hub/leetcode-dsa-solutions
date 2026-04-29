link:-https://leetcode.com/problems/generate-parentheses/description/

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, 
                           int open, int close, int n) {
        
        // If the string length becomes 2*n, it is valid
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add "(" if we still have opening brackets left
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Add ")" only if it won't break validity
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}
