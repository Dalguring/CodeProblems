import java.util.*;

class Solution {
    public String solution(String s) {
        Character[] characters = s.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Arrays.sort(characters, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        Arrays.stream(characters).forEach(sb::append);
        
        return sb.toString();
    }
}