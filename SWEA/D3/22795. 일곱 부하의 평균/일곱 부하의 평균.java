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
            int max = 0;
            int sum = 0;

            while (st.hasMoreTokens()) {
                int tall = Integer.parseInt(st.nextToken());
                max = Math.max(max, tall);
                sum += tall;
            }

            sb.append((7 - (sum + max) % 7) + max).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}