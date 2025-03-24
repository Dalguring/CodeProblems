import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            long number = Long.parseLong(br.readLine());
            int divider = (int) Math.sqrt(number);

            for (int i = divider; i >= 1; i--) {
                if (number % i == 0) {
                    sb.append(String.format("#%d %d\n", tc + 1, i + number / i - 2));
                    break;
                }
            }
        }

        System.out.print(sb);
        br.close();
    }
}
