import java.util.Stack;

class Solution {
    public String solution(String p) {
        StringBuilder sb = new StringBuilder();

        if (p.isEmpty() || isCorrect(p)) {
            return p;
        }

        String minSatisfied = minimumBalanced(p);
        String remain = p.substring(minSatisfied.length());

        if (isCorrect(minSatisfied)) {
            sb.append(minSatisfied).append(makeCorrect(remain));
        } else {
            sb.append(makeCorrect(p));
        }
        
        return sb.toString();
    }
    
    static boolean isCorrect(String parentheses) {
        if (parentheses.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        char[] parenthesis = parentheses.toCharArray();

        for (char c : parenthesis) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    static String minimumBalanced(String parentheses) {
        int count = 0;

        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '(') count++;
            else count--;

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
        String remain = parentheses.substring(minSatisfied.length());

        if (isCorrect(minSatisfied)) {
            return minSatisfied + makeCorrect(remain);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("(");
        sb.append(makeCorrect(remain));
        sb.append(")");

        if (minSatisfied.length() > 2) {
            String inner = minSatisfied.substring(1, minSatisfied.length() - 1);
            for (char c : inner.toCharArray()) {
                sb.append(c == '(' ? ')' : '(');
            }
        }

        return sb.toString();
    }
}