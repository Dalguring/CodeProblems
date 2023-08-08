import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < lines.length; i++) {
            int min = Math.min(lines[i][0], lines[i][1]);
            int max = Math.max(lines[i][0], lines[i][1]);

            for (int j = min; j < max; j++) {
                dict.put(j, dict.getOrDefault(j, 0) + 1);
            }
        }

        int answer = 0;

        for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
            if (entry.getValue() >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
}