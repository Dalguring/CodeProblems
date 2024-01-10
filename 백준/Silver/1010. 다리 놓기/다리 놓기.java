import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int performCount = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < performCount; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(comb(n, r)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static int comb(int n, int r) {
        if (dp[n][r] > 0)
            return dp[n][r];

        if (n == r || r == 0)
            return dp[n][r] = 1;

        return dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
    }
}
