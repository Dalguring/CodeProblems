import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        List<Integer> scores;

        for (int i = 0; i < t; i++) {
            scores = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                scores.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(scores);
            if (scores.get(3) - scores.get(1) >= 4) {
                sb.append("KIN\n");
            } else {
                sb.append(scores.get(1) + scores.get(2) + scores.get(3)).append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}