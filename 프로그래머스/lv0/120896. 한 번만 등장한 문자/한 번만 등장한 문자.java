import java.util.*;

class Solution {
    public String solution(String s) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for(char c : s.toCharArray())
            treeMap.put(String.valueOf(c), treeMap.getOrDefault(String.valueOf(c), 0) + 1);

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> el : treeMap.entrySet()) {
            if(el.getValue() == 1)
                sb.append(el.getKey());
        }
        
        return sb.toString();
    }
}