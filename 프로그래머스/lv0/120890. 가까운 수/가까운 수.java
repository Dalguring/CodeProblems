import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int absNum = Math.abs(array[i] - n);
            if(map.containsKey(absNum)) {
                if(array[map.get(absNum)] < array[i])
                    continue;
            }
            map.put(absNum, i);
        }

        TreeMap<Integer, Integer> treeMap = new TreeMap<>(map);

        int first = treeMap.keySet().iterator().next();
        int second = treeMap.keySet().iterator().next();
        if(first == second) 
            return Math.min(array[treeMap.get(first)], array[treeMap.get(second)]);
        else 
            return array[treeMap.get(first)];
    }
}