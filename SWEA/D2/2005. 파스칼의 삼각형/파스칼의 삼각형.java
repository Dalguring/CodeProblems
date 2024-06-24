import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int size = Integer.parseInt(br.readLine());
            int[][] pascal = new int[size][];

            for (int j = 0; j < size; j++) {
                pascal[j] = new int[j + 1];
                pascal[j][0] = 1;
                pascal[j][pascal[j].length - 1] = 1;
            }

            for (int j = 2; j < size; j++) {
                for (int k = 1; k < pascal[j].length - 1; k++) {
                    pascal[j][k] = pascal[j - 1][k - 1] + pascal[j - 1][k];
                }
            }

            sb.append(String.format("#%d", i + 1)).append("\n");

            for (int[] arr : pascal) {
                for (int num : arr) {
                    sb.append(num).append(" ");
                }
                sb.append("\n");
            }

        }

        System.out.println(sb);
        br.close();
    }
}
