import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] charArray = my_string.toLowerCase().toCharArray();
		Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}