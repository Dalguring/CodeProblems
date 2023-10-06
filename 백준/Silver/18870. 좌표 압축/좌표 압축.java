import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] origin = new int[N];
        int[] sorted = new int[N];
        br.close();

        for (int i = 0; i < N; i++)
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(sorted);
        int rank = 0;
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int value : sorted) {
            if (rankMap.containsKey(value))
                continue;
            rankMap.put(value, rank);
            rank++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : origin)
            sb.append(rankMap.get(i)).append(" ");

        System.out.println(sb.toString().trim());
    }
}