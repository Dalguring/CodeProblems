import java.util.Stack;

class Solution {
    public int solution(String s) {
        s = s.repeat(2);
        int collect = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            Stack<Character> characterStack = new Stack<>();

            for (char c : s.substring(i, s.length() / 2 + i).toCharArray()) {
                char p = switch (c) {
                    case ']' -> '[';
                    case ')' -> '(';
                    case '}' -> '{';
                    default -> ' ';
                };

                if (characterStack.isEmpty() || characterStack.peek() != p) {
                    characterStack.push(c);
                } else {
                    characterStack.pop();
                }
            }

            if (characterStack.isEmpty()) {
                collect++;
            }
        }
        
        return collect;
    }
}