import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    static int tangers = 0;
    static int cycle = 0;
    
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> tangerines = new HashMap<>();
        for (int t : tangerine) {
            tangerines.put(t, tangerines.getOrDefault(t, 0) + 1);
        }

        tangerines.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> {
                    if (tangers < k) {
                        cycle++;
                        tangers += entry.getValue();
                    }
                });
        
        return cycle;
    }
}