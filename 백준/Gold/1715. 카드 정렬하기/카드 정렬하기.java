import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++)
            pq.add(Integer.parseInt(br.readLine()));

        br.close();
        int sum = 0;
        while (pq.size() != 1) {
            int num = pq.poll() + pq.poll();
            pq.add(num);
            sum += num;
        }

        System.out.println(sum);
    }
}