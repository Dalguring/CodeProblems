import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (char c : s.toCharArray()) {
            if (String.valueOf(c).equals(" ")) {
                sb.append(" ");
                index = 0;
                continue;
            }
            if (index % 2 == 0 && String.valueOf(c).matches("[a-zA-Z]")) {
                sb.append(String.valueOf(c).toUpperCase());
                index++;
            } else {
                sb.append(String.valueOf(c).toLowerCase());
                index++;
            }
        }
        
        return sb.toString();
    }
}