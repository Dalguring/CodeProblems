import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : numlist)
            map.put(i, Math.abs(n - i));

        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(map.entrySet());
        mapList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return !o1.getValue().equals(o2.getValue()) ? o1.getValue() - o2.getValue() : o2.getKey() - o1.getKey();
            }
        });

        int[] answer = new int[mapList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = mapList.get(i).getKey();
        }
        
        return answer;
    }
}