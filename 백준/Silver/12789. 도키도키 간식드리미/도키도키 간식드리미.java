import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> lineQueue = new LinkedList<>();
        Stack<Integer> waitStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int temp = 1;
        br.close();

        while (st.hasMoreTokens()) {
            lineQueue.add(Integer.parseInt(st.nextToken()));
        }

        while (temp <= N) {
            if (!lineQueue.isEmpty() && lineQueue.peek() == temp) {
                lineQueue.poll();
                temp++;
                while (!waitStack.isEmpty() && waitStack.peek() == temp) {
                    waitStack.pop();
                    temp++;
                }
                continue;
            }

            if (!lineQueue.isEmpty())
                waitStack.add(lineQueue.poll());

            if (waitStack.peek() == temp) {
                waitStack.pop();
                temp++;
                continue;
            }

            if (lineQueue.isEmpty() && !waitStack.isEmpty())
                break;
        }

        if (waitStack.isEmpty())
            System.out.println("Nice");
        else System.out.println("Sad");
    }
}
