import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp = new int[5001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[3] = 1;
        dp[5] = 1;

        for (int i = 5; i < dp.length; i++) {
            if (dp[i - 3] == 0 && dp[i - 5] == 0) {
                continue;
            }

            if (i % 5 == 0) {
                dp[i] = dp[i - 5] + 1;
            } else {
                dp[i] = dp[i - 3] + 1;
            }
        }

        int answer = dp[Integer.parseInt(br.readLine())];

        if (answer == 0) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
        
        br.close();
    }
}
