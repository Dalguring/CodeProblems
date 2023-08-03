import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int height) {
        List<Integer> list = new LinkedList<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
        list.add(height);
        Collections.sort(list);
        
        return list.size() - list.lastIndexOf(height) - 1;
    }
}