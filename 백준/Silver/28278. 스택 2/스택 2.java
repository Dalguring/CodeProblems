import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int command = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < command; i++) {
            st = new StringTokenizer(br.readLine());
            int commandNum = Integer.parseInt(st.nextToken());
            int inputNum = 0;
            if(commandNum == 1)
                inputNum = Integer.parseInt(st.nextToken());
            switch (commandNum) {
                case 1:
                    stack.push(inputNum);
                    break;
                case 2:
                    if(!stack.isEmpty())
                        sb.append(stack.pop()).append("\n");
                    else
                        sb.append("-1\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if(!stack.isEmpty())
                        sb.append("0\n");
                    else
                        sb.append("1\n");
                    break;
                case 5:
                    if(!stack.isEmpty())
                        sb.append(stack.peek()).append("\n");
                    else
                        sb.append("-1\n");
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}
