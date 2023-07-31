import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < array.length; i++)
            treeMap.put(array[i], i);
        int key = treeMap.keySet().iterator().next();
        
        return new int[]{key, treeMap.get(key)};
    }
}