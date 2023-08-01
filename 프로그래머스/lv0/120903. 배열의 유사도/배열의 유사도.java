import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = Arrays.stream(s2).collect(Collectors.toList());
        for(String s : s1) {
            if(list.contains(s))
                answer++;
        }
        
        return answer;
    }
}