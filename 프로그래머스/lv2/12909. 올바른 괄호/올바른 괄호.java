import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int left = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String target = String.valueOf(s.charAt(i));
            if (target.equals("("))
                left++;
            else
                left--;
            if(left < 0)
                return false;
        }
        if(left > 0)
            return false;
        
        return true;
    }
}