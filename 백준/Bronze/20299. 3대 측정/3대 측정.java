import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int teams = Integer.parseInt(st.nextToken());
        int totalLimit = Integer.parseInt(st.nextToken());
        int perLimit = Integer.parseInt(st.nextToken());
        int vipTeams = 0;

        OUTER:
        for (int i = 0; i < teams; i++) {
            st = new StringTokenizer(br.readLine());

            int sum = 0;
            List<Integer> scoreList = new ArrayList<>();

            while (st.hasMoreTokens()) {
                int score = Integer.parseInt(st.nextToken());
                if (score < perLimit) {
                    continue OUTER;
                }

                sum += score;
                scoreList.add(score);
            }

            if (sum >= totalLimit) {
                vipTeams++;
                scoreList.forEach(score -> sb.append(score).append(" "));
            }
        }

        System.out.println(vipTeams);
        System.out.println(sb);
        br.close();
    }
}
