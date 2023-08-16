import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++)
            map.put(name[i], yearning[i]);

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(String[] strArr : photo) {
            for(String s : strArr) {
                if(map.containsKey(s))
                    sum += map.get(s);
            }
            list.add(sum);
            sum = 0;
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}