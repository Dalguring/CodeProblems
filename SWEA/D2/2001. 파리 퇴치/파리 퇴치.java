import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int flapper = Integer.parseInt(st.nextToken());
            int[][] flies = new int[size][size];
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < size; j++) {
                String[] numbers = br.readLine().split(" ");
                for (int k = 0; k < size; k++) {
                    flies[j][k] = Integer.parseInt(numbers[k]);
                }
            }

            int[][] wrappedPrefixSum = new int[size + 1][size + 1];
            // 2차원 누적합
            for (int j = 1; j < size + 1; j++) {
                for (int k = 1; k < size + 1; k++) {
                    wrappedPrefixSum[j][k] = flies[j - 1][k - 1] + wrappedPrefixSum[j - 1][k] + wrappedPrefixSum[j][k - 1] - wrappedPrefixSum[j - 1][k - 1];
                }
            }
            // 2차원 누적합 중 최대값 searching
            for (int j = flapper; j < wrappedPrefixSum.length; j++) {
                for (int k = flapper; k < wrappedPrefixSum.length; k++) {
                    max = Math.max(max, wrappedPrefixSum[j][k] - wrappedPrefixSum[j - flapper][k] - wrappedPrefixSum[j][k - flapper] + wrappedPrefixSum[j - flapper][k - flapper]);
                }
            }

            sb.append(String.format("#%d %d", i + 1, max)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}