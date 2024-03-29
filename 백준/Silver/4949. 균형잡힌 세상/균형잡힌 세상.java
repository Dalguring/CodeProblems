import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while(true) {
            String sentence = br.readLine();
            // "." 입력 시 루프 종료
            if (sentence.equals(".")) break;

            // 입력 받은 문자열 필터링
            char[] target = sentence.replaceAll("[^()\\[\\]]", "").toCharArray();
            //" . " 입력 시 yes 처리
            if (target.length == 0) {
                sb.append("yes\n");
                continue;
            }
            try {
                for (char c : target) {
                    if (c == '(' || c == '[') stack.push(c);
                    else if(stack.isEmpty()) throw new Exception();
                    else if (c == ')') {
                        if (!stack.peek().equals('(')) throw new Exception();
                        else stack.pop();
                    } else if (c == ']') {
                        if (!stack.peek().equals('[')) throw new Exception();
                        else stack.pop();
                    }
                }
                // 모든 문자열 처리 후
                if(stack.isEmpty()) sb.append("yes\n");
                else sb.append("no\n");
                // Stack 에 남은 문자 clear
                stack.clear();
            }
            catch (Exception e) {
                sb.append("no\n");
                stack.clear();
            }
        }
        br.close();
        System.out.println(sb);
    }
}

