import java.util.*;

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase().replaceAll("[^py]", "");

        if (s.length() == 0)
            return true;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = String.valueOf(chars);
        if (s.lastIndexOf("p") + 1 == s.length() - s.indexOf("y"))
            return true;
        else 
            return false;
    }
}