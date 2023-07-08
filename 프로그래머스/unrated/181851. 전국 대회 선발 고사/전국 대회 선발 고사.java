import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> rankMap = new LinkedHashMap<>();
        for (int i = 0; i < rank.length; i++)
            if(attendance[i]) rankMap.put(rank[i], i);

        TreeMap<Integer, Integer> treeMap = new TreeMap<>(rankMap);
        ArrayList<Integer> arrayList = new ArrayList<>(treeMap.values());

        return arrayList.get(0) * 10000
             + arrayList.get(1) * 100
             + arrayList.get(2);
    }
}