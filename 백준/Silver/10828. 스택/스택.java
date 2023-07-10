import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int command = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < command; i++) {
            String commandCase = br.readLine();
            switch (commandCase.split(" ")[0]) {
                case "push":
                    stack.push(Integer.valueOf(commandCase.split(" ")[1])); break;
                case "pop":
                    if(stack.isEmpty())
                        System.out.println("-1");
                    else System.out.println(stack.pop()); break;
                case "size":
                    System.out.println(stack.size()); break;
                case "empty":
                    System.out.println(stack.isEmpty()? 1 : 0); break;
                case "top":
                    if(stack.isEmpty())
                        System.out.println("-1");
                    else System.out.println(stack.peek());break;
            }
        }
        br.close();
    }
}

