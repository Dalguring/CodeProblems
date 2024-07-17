import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        
        for (int i = 1; i <= order.length; i++) {
            stack.push(i);
            
            while (!stack.isEmpty() && stack.peek() == order[count]) {
                stack.pop();
                count++;
            }
        }

        return count;
    }
}