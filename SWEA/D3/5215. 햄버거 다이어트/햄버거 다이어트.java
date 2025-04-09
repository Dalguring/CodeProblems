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
            int ingredient = Integer.parseInt(st.nextToken());
            int limitCalorie = Integer.parseInt(st.nextToken());
            int[] taste = new int[ingredient + 1];
            int[] calorie = new int[ingredient + 1];

            for (int i = 1; i <= ingredient; i++) {
                st = new StringTokenizer(br.readLine());
                taste[i] = Integer.parseInt(st.nextToken());
                calorie[i] = Integer.parseInt(st.nextToken());
            }

            int[][] dp = new int[ingredient + 1][limitCalorie + 1];

            for (int i = 1; i <= ingredient; i++) {
                for (int j = 0; j <= limitCalorie; j++) {
                    dp[i][j] = dp[i - 1][j];

                    if (j >= calorie[i]) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - calorie[i]] + taste[i]);
                    }
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, dp[ingredient][limitCalorie]));
        }

        System.out.print(sb);
        br.close();
    }
}
