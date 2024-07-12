import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        Set<Character> skills = new LinkedHashSet<>();
        for (char c : skill.toCharArray()) {
            skills.add(c);
        }

        int result = 0;

        for (String s : skill_trees) {
            Iterator<Character> skillIterator = skills.iterator();
            char current = skillIterator.next();
            boolean isRight = true;

            for (char c : s.toCharArray()) {
                if (skills.contains(c)) {
                    if (c != current) {
                        isRight = false;
                        break;
                    }
                    if (skillIterator.hasNext()) {
                        current = skillIterator.next();
                    }
                }
            }

            if (isRight) {
                result++;
            }
        }
        
        return result;
    }
}