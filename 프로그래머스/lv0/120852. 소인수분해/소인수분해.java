import java.util.*;

class Solution {
    public int[] solution(int n) {
        int divider = 2;
        Set<Integer> set = new LinkedHashSet<>();
        while(n != 1) {
            if(n % divider == 0) {
                n /= divider;
                set.add(divider);
            } else divider++;
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}