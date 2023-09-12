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
        int size = target.length();
        for (char c : string.toCharArray()) {
            stack.push(c);

            if (stack.size() >= size) {
                int count = 0;
                for (int i = size; i >= 1; i--)
                    if (stack.get(stack.size() - i) == target.charAt(size - i))
                        count++;

                if (count == size) {
                    for (int i = 0; i < size; i++)
                        stack.pop();
                }
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