import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();
		for(char c : my_string.toCharArray()) list.add(c);
		
		Set<Character> set = new LinkedHashSet<Character>(list);
        for(char c : set) answer += c;
        
        return answer;
    }
}