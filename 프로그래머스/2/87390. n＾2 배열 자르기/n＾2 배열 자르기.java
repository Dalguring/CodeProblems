import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, long left, long right) {
        List<Integer> list = new ArrayList<>();

        for (long i = left; i <= right; i++) {
            int start = (int)(i / n + 1);

            if (i % n <= i / n) {
                list.add(start);
            } else {
                list.add((int)(start + (i % n) - (i / n)));
            }
        }

        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}