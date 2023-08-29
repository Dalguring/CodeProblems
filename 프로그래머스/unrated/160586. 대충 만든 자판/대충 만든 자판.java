import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> map = new HashMap<>();
        for (String keys : keymap) {
            int index = 1;
            for (String s : keys.split("")) {
                if (map.get(s) == null)
                    map.put(s, index);
                else
                    map.put(s, Math.min(map.get(s), index));
                index++;
            }
        }
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if (map.get(targets[i].split("")[j]) != null)
                    sum += map.get(targets[i].split("")[j]);
                else {
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}