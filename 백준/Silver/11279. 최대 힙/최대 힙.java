import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(br.readLine());

            switch (target) {
                case 0:
                    if (pq.isEmpty())
                        sb.append(0 + "\n");
                    else
                        sb.append(pq.poll() + "\n");
                    break;
                default:
                    pq.add(target);
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}
