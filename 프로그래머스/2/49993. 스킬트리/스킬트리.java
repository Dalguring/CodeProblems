import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        List<Character> skills = skill.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        int result = 0;

        for (String s : skill_trees) {
            int pointer = 0;
            boolean isRight = true;

            for (char c : s.toCharArray()) {
                if (skills.contains(c)) {
                    if (c != skills.get(pointer)) {
                        isRight = false;
                        break;
                    }
                    pointer++;
                }
            }

            if (isRight) {
                result++;
            }
        }
        
        return result;
    }
}