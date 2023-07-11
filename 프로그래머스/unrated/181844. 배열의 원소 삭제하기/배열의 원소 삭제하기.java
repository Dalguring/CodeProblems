import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        list.removeAll(Arrays.stream(delete_list).boxed().collect(Collectors.toList()));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}