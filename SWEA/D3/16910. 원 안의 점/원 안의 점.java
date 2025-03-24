import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int radius = Integer.parseInt(br.readLine());
            int points = 0;

            for (int i = 1; i < radius; i++) {
                boolean isFit = false;

                for (int j = radius; j >= 1; j--) {
                    isFit = Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(radius, 2);

                    if (isFit) {
                        points += j;
                        break;
                    }
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, points * 4 + radius * 4 + 1));
        }

        System.out.print(sb);
        br.close();
    }
}
