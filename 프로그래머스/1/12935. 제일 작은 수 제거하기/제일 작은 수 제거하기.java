import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[]{-1};

        int min = Integer.MAX_VALUE;

        for (int i : arr)
            min = Math.min(min, i);

        List<Integer> list = new LinkedList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        list.remove(list.indexOf(min));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}