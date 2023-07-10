import java.io.*;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int command = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < command; i++) {
            char[] target = br.readLine().toCharArray();
            try {
                for(char c : target) {
                    if (c == '(') stack.push("(");
                    else if (c == ')') stack.pop();
                }
            if(stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
            stack.clear();
            } catch (Exception e) {
                sb.append("NO\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}

