import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        br.close();

        for (int i = 1; i <= N; i++) {
            deque.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }
        int cycle = deque.pollFirst()[1];
        sb.append(1).append("\n");

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < Math.abs(cycle) - 1; j++) {
                if (cycle > 0) {
                    deque.add(deque.pollFirst());
                } else {
                    deque.addFirst(deque.pollLast());
                }
            }
            if (cycle > 0) {
                sb.append(deque.peekFirst()[0]).append("\n");
                cycle = deque.peekFirst()[1];
                deque.pollFirst();
            } else {
                sb.append(deque.peekLast()[0]).append("\n");
                cycle = deque.peekLast()[1];
                deque.pollLast();
            }
        }
        System.out.println(sb);
    }
    
}
