import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> priceStack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!priceStack.isEmpty() && prices[priceStack.peek()] > prices[i]) {
                answer[priceStack.peek()] = i - priceStack.pop();
            }

            priceStack.push(i);
        }

        while (!priceStack.isEmpty()) {
            int index = priceStack.pop();
            answer[index] = prices.length - 1 - index;
        }
        
        return answer;
    }
}