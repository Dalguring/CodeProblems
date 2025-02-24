import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            st = new StringTokenizer(br.readLine());
            int perLiter = Integer.parseInt(st.nextToken());
            int baseRate = Integer.parseInt(st.nextToken());
            int criticalPoint = Integer.parseInt(st.nextToken());
            int additionalRate = Integer.parseInt(st.nextToken());
            int waterAmount = Integer.parseInt(st.nextToken());

            sb.append(String.format("#%d %d\n", tc + 1, Math.min(perLiter * waterAmount
                    , baseRate + (waterAmount > criticalPoint ? (waterAmount - criticalPoint) * additionalRate : 0))));
        }

        System.out.println(sb);
        br.close();
    }
}