import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        List<Integer> list = new ArrayList<>(set);
        if(set.size() >= k) {
            return list.stream().mapToInt(Integer::intValue).limit(k).toArray();
        } else {
            for (int i = 0; i < k - set.size(); i++) {
                list.add(-1);
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}