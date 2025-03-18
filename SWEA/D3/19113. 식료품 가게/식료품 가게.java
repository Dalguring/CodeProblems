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
            int goods = Integer.parseInt(br.readLine());
            long[] prices = new long[goods * 2];
            st = new StringTokenizer(br.readLine());
            sb.append("#").append(tc + 1);

            for (int i = 0; i < prices.length; i++) {
                prices[i] = Long.parseLong(st.nextToken());
            }

            for (int i = 1; i < prices.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (prices[i] * 0.75 == prices[j]) {
                        sb.append(" ").append(prices[j]);
                        prices[i] = 0;
                        prices[j] = 0;
                        break;
                    }
                }
            }

            sb.append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}