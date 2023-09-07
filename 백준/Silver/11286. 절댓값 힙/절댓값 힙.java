import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) == Math.abs(o2) ? o1 - o2 : Math.abs(o1) - Math.abs(o2);
            }
        });
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(br.readLine());

            if (target == 0) {
                if (!pq.isEmpty())
                    sb.append(pq.poll()).append("\n");
                else sb.append("0\n");
            } else
                pq.add(target);
        }
        br.close();
        System.out.println(sb);
    }
}
