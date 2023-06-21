import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String str : intStrs) {
            int target = Integer.parseInt(str.substring(s, s + l));
            if (target > k) list.add(target);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}