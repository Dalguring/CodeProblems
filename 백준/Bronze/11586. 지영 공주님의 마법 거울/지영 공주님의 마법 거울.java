import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<String> deque = new LinkedList<>();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            deque.offer(br.readLine());
        }

        int mood = Integer.parseInt(br.readLine());

        switch (mood) {
            case 1:
                while (!deque.isEmpty()) {
                    sb.append(deque.poll()).append("\n");
                }
                break;
            case 2:
                while (!deque.isEmpty()) {
                    StringBuilder sub = new StringBuilder(deque.poll()).reverse();
                    sb.append(sub).append("\n");
                }
                break;
            case 3:
                while (!deque.isEmpty()) {
                    sb.append(deque.pollLast()).append("\n");
                }
                break;
        }

        System.out.println(sb);
        br.close();
    }
}
