import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int commands = Integer.parseInt(br.readLine());

        for (int i = 0; i < commands; i++) {
            String command = br.readLine();
            Stack<Character> stack = new Stack<>();
            char[] chars = command.toCharArray();
            boolean isVPS = true;

            for (char c : chars) {
                if (c == '(') {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }

                    stack.pop();
                }
            }

            if (!isVPS || !stack.isEmpty()) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}