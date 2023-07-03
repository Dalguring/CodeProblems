import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers, int n) {
        ArrayList<Integer> list = 
            (ArrayList<Integer>) Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int sum = 0;
        
        return sumMethod(list, n, sum);
    }
    
    static int sumMethod(ArrayList<Integer> list, int n, int sum) {
        sum += list.get(0);
        list.remove(0);
        if(n < sum) return sum;

        return sumMethod(list, n, sum);
    }
}