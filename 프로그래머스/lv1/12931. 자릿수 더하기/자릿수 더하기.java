import java.util.*;

public class Solution {
    public int solution(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int answer = 0;
        for (char c : chars)
            answer += Character.getNumericValue(c);
        
        return answer;
    }
}