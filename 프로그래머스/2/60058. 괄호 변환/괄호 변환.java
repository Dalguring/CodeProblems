import java.util.Stack;

class Solution {
    public String solution(String p) {
        if (p.equals("") || isCorrect(p)) {
            return p;
        }
        
        return makeCorrect(p);
    }
    
    static boolean isCorrect(String parentheses) {
        if (parentheses.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        char[] parenthesis = parentheses.toCharArray();

        for (char c : parenthesis) {
            if (stack.isEmpty() || c == '(') {
                stack.push(c);
            } else if (stack.peek() == ')') {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    static String minimumBalanced(String parentheses) {
        int count = 0;

        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                return parentheses.substring(0, i + 1);
            }
        }
        return "";
    }

    static String makeCorrect(String parentheses) {
        if (parentheses.isEmpty()) {
            return "";
        }

        String minSatisfied = minimumBalanced(parentheses);

        if (isCorrect(minSatisfied)) {
            return minSatisfied + makeCorrect(parentheses.substring(minSatisfied.length()));
        }

        StringBuilder sb = new StringBuilder(parentheses.length())  // 초기 capacity 설정
                .append('(')
                .append(makeCorrect(parentheses.substring(minSatisfied.length())))
                .append(')');

        if (minSatisfied.length() > 2) {
            for (int i = 1; i < minSatisfied.length() - 1; i++) {
                sb.append(minSatisfied.charAt(i) == '(' ? ')' : '(');
            }
        }

        return sb.toString();
    }
}