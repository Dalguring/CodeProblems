import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {
        List<Integer> list = new LinkedList<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
        Collections.sort(list);
        
        int count = list.lastIndexOf(n) - list.indexOf(n) + 1;
        if(list.lastIndexOf(n) == -1)
            return 0;
        else 
            return count;
    }
}