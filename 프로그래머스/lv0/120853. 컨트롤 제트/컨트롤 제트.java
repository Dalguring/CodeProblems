import java.util.*;

class Solution {
    public int solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if(token.equals("Z")) {
                stack.pop();
                continue;
            }
            stack.push(Integer.parseInt(token));
        }
        
        return stack.stream().mapToInt(i -> i).sum();
    }
}