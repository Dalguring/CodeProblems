import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] stackOrQueue = new int[N];
        for (int i = 0; i < stackOrQueue.length; i++)
            stackOrQueue[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < stackOrQueue.length; i++) {
            if (stackOrQueue[i] == 0)
                deque.add(Integer.parseInt(st.nextToken()));
            else st.nextToken();
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();

        while (M -- > 0) {
            int inputNum = Integer.parseInt(st.nextToken());
            deque.addFirst(inputNum);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}