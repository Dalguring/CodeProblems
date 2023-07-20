import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        int[] checkCnt = new int[1001];
        int max = Integer.MIN_VALUE;
        
        for (int i : array)
            checkCnt[i]++;
        
        for (int i : checkCnt)
            max = Math.max(max, i);
        
        List<Integer> list = new ArrayList<>(Arrays.stream(checkCnt).boxed().collect(Collectors.toList()));
        
        if(list.indexOf(max) != list.lastIndexOf(max)) return -1;
        else return list.indexOf(max);
    }
}