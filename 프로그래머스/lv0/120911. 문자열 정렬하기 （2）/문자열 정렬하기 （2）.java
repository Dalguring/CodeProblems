import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        List<Character> list = new ArrayList<>();
		for(char c : my_string.toLowerCase().toCharArray()) list.add(c);
		Collections.sort(list);
        
        for(char c : list) answer += c;
        return answer;
    }
}