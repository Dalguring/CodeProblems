import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        return Arrays.stream(num_list).boxed().collect(Collectors.toList()).subList(n - 1, num_list.length).stream().mapToInt(Integer::intValue).toArray();
    }
}