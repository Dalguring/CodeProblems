import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new LinkedList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c)))
                list.add(String.valueOf(c));
        }

        for (int i = 0; i < s.length(); i++) {
            int targetIndex = list.indexOf(Character.toString(s.charAt(i))) + index;
            sb.append(list.get(targetIndex % list.size()));
        }
        
        return sb.toString();
    }
}