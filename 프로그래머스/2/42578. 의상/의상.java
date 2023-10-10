import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] s : clothes)
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> el : map.entrySet())
            list.add(el.getValue() + 1);

        int answer = 1;
        for (int i : list)
            answer *= i;

        answer--;
        
        return answer;
    }
}