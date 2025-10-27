import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commands = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < commands; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                queue.offer(Integer.parseInt(command.split(" ")[1]));
                continue;
            }

            switch (command) {
                case "pop":
                    sb.append(queue.isEmpty() ? "-1" : queue.pollFirst()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1" : queue.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? "-1" : queue.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}