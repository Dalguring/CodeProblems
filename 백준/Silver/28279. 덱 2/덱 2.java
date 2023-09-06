import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int command;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1: deque.addFirst(Integer.parseInt(st.nextToken())); break;
                case 2: deque.addLast(Integer.parseInt(st.nextToken())); break;
                case 3:
                    if (!deque.isEmpty())
                        sb.append(deque.pollFirst()).append("\n");
                    else sb.append("-1\n");
                    break;
                case 4:
                    if (!deque.isEmpty())
                        sb.append(deque.pollLast()).append("\n");
                    else sb.append("-1\n");
                    break;
                case 5: sb.append(deque.size()).append("\n"); break;
                case 6:
                    if (!deque.isEmpty())
                        sb.append("0\n");
                    else sb.append("1\n");
                    break;
                case 7:
                    if (!deque.isEmpty())
                        sb.append(deque.peekFirst()).append("\n");
                    else sb.append("-1\n");
                    break;
                case 8:
                    if (!deque.isEmpty())
                        sb.append(deque.peekLast()).append("\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}
