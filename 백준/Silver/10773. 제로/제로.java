import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int command = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < command; i++) {
            int target = Integer.parseInt(br.readLine());
            if(target == 0) {
                stack.pop();
                continue;
            }
            stack.push(target);
        }
        br.close();
        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }
}

