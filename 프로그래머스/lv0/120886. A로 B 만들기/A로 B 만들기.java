import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] beforeCharArr = before.toCharArray();
        char[] afterCharArr = after.toCharArray();
        Arrays.sort(beforeCharArr);
        Arrays.sort(afterCharArr);

        return String.valueOf(beforeCharArr).equals(String.valueOf(afterCharArr)) ? 1 : 0;
    }
}