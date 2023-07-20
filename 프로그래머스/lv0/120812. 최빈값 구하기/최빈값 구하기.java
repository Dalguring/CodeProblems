import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i : array)
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        
        List<Map.Entry<Integer, Integer>> el = new ArrayList<>(hashMap.entrySet());
        el.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        
        if(el.size() > 1) {
            if(el.get(0).getValue() == el.get(1).getValue()) return -1;
        }
        return el.get(0).getKey();
        
    }
}