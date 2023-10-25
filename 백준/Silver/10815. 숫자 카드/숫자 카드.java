import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++)
            hashSet.add(Integer.parseInt(st.nextToken()));

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        br.close();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (hashSet.contains(target))
                sb.append("1 ");
            else sb.append("0 ");
        }

        System.out.println(sb);
    }
}
