import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                if(flag[i]) {
                    stack.push(arr[i]);
                    stack.push(arr[i]);
                } else stack.pop();
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}