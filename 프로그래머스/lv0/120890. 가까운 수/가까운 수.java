import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        int index = -1;
        
        for (int i = 0; i < array.length; i++) {
            if(min > Math.abs(n - array[i])) {
                min = Math.abs(n - array[i]);
                if(index == i)
                    continue;
                index = i;
            }
        }
        
        return array[index];
    }
}