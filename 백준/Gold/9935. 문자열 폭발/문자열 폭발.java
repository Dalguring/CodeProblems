import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String target = br.readLine();
        br.close();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        OUTER:
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));

            if (stack.size() >= target.length()) {
                for (int j = target.length(); j >= 1; j--)
                    if (stack.get(stack.size() - j) != target.charAt(target.length() - j))
                        continue OUTER;

                for (int j = 0; j < target.length(); j++)
                    stack.pop();
            }
        }

        if (stack.isEmpty())
            sb.append("FRULA");
        else {
            for (char c : stack)
                sb.append(c);
        }

        System.out.println(sb);
    }
}