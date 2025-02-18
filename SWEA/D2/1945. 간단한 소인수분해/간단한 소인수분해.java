import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static final int[] DIVISOR = {2, 3, 5, 7, 11};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            sb.append(String.format("#%d ", tc + 1));
            int dividend = Integer.parseInt(br.readLine());

            for (int number : DIVISOR) {
                sb.append(getDivideCount(dividend, number)).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static int getDivideCount(int dividend, int number) {
        int count = 0;

        while (dividend % number == 0) {
            dividend /= number;
            count++;
        }

        return count;
    }
}