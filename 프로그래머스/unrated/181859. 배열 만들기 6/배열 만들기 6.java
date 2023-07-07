import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()) stack.push(arr[i]);
            else if(!stack.isEmpty() && stack.get(stack.size() - 1) == arr[i]) stack.pop();
            else if(!stack.isEmpty() && stack.get(stack.size() - 1) != arr[i]) stack.add(arr[i]);
        }

        if(stack.size() == 0) stack.add(-1);
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}