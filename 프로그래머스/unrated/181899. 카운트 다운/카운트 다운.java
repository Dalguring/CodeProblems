import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int start, int end) {
        
        Integer[] integers = IntStream.rangeClosed(end, start).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
    }
}