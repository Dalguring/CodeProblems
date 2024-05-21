import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                numbers[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            numbers[stack.pop()] = -1;
        }
        
        return numbers;
    }
}