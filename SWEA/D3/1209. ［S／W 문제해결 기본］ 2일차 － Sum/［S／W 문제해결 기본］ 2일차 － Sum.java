import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int tc = 0; tc < 10; tc++) {
            br.readLine();
            int[][] arrays = new int[100][100];
            int maxSum = 0;
            int sum = 0;

            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < 100; j++) {
                    arrays[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 가로합
            for (int i = 0; i < 100; i++) {
                sum = 0;

                for (int j = 0; j < 100; j++) {
                    sum += arrays[i][j];
                }

                maxSum = Math.max(maxSum, sum);
            }

            // 세로합
            for (int i = 0; i < 100; i++) {
                sum = 0;

                for (int j = 0; j < 100; j++) {
                    sum += arrays[j][i];
                }

                maxSum = Math.max(maxSum, sum);
            }

            // 대각합
            sum = 0;

            for (int i = 0; i < 100; i++) {
                sum += arrays[i][i];
            }

            maxSum = Math.max(maxSum, sum);
            sum = 0;

            for (int i = 0; i < 100; i++) {
                sum += arrays[i][99 - i];
            }

            maxSum = Math.max(maxSum, sum);
            sb.append(String.format("#%d %d\n", tc + 1, maxSum));
        }

        System.out.print(sb);
        br.close();
    }
}
