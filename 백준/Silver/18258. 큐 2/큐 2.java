import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int last = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.add(last); break;
                case "pop":
                    if (!queue.isEmpty())
                        sb.append(queue.poll()).append("\n");
                    else
                        sb.append("-1\n");
                    break;
                case "size": sb.append(queue.size()).append("\n"); break;
                case "empty":
                    if (queue.isEmpty())
                        sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if (!queue.isEmpty())
                        sb.append(queue.peek()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "back":
                    if (!queue.isEmpty())
                        sb.append(last).append("\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}
