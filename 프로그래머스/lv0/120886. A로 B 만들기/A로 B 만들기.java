import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] beforeCharArr = before.toCharArray();
        char[] afterCharArr = after.toCharArray();
        Arrays.sort(beforeCharArr);
        Arrays.sort(afterCharArr);
        
        int answer = 1;
        for (int i = 0; i < beforeCharArr.length; i++) {
            answer = beforeCharArr[i] == afterCharArr[i] ? 1 : 0;
            if(answer == 0)
                return answer;
        }
        return answer;
    }
}