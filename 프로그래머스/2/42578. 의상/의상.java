import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] s : clothes)
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);

        Iterator<Integer> iterator = map.values().iterator();
        int answer = 1;
        while (iterator.hasNext())
            answer *= iterator.next() + 1;
        
        return answer - 1;
    }
}