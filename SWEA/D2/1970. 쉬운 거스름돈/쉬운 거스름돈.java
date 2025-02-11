import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int[] changeArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int change = Integer.parseInt(br.readLine());
            int[] changeCount = new int[changeArray.length];

            for (int i = 0; i < changeArray.length; i++) {
                changeCount[i] = change / changeArray[i];
                change %= changeArray[i];
            }
            sb.append(String.format("#%d\n", tc + 1));

            for (int count : changeCount) {
                sb.append(count).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}