import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            st = new StringTokenizer(br.readLine());
            int pockets = Integer.parseInt(st.nextToken());
            int divide = Integer.parseInt(st.nextToken());
            int[] candiesPerPocket = new int[pockets];
            int min = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < pockets; i++) {
                candiesPerPocket[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(candiesPerPocket);

            for (int i = 0; i <= pockets - divide; i++) {
                min = Math.min(min, candiesPerPocket[i + divide - 1] - candiesPerPocket[i]);
            }

            sb.append(String.format("#%d %d\n", tc + 1, min));
        }

        System.out.print(sb);
        br.close();
    }
}