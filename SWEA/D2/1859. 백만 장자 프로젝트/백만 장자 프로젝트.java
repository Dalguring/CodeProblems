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
            int days = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] prices = new int[days];
            long profit = 0;
            int maxPrice = 0;

            for (int i = 0; i < prices.length; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = prices.length - 1; i >= 0; i--) {
                if (maxPrice < prices[i]) {
                    maxPrice = prices[i];
                    continue;
                }

                profit += maxPrice - prices[i];
            }

            sb.append(String.format("#%d %d\n", tc + 1, profit));
        }

        System.out.println(sb);
        br.close();
    }
}