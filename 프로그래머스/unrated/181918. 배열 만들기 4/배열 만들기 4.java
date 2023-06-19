import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while(i < arr.length) {
            if(stack.isEmpty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if(stack.peek() >= arr[i]) {
                stack.pop();
            }
        }

        return stack.stream().mapToInt(e -> e).toArray();
    }
}