import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, Integer> scoreMap = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int score = 0;

            while (st.hasMoreTokens()) {
                score += Integer.parseInt(st.nextToken());
            }

            scoreMap.put(score, i + 1);
        }

        Iterator<Integer> iterator = scoreMap.keySet().iterator();
        int maxScore = iterator.next();

        System.out.println(scoreMap.get(maxScore) + " " + maxScore);
        br.close();
    }
}
