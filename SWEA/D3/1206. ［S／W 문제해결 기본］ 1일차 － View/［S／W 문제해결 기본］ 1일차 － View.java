import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < 10; tc++) {
            int buildings = Integer.parseInt(br.readLine());
            int[] heights = new int[buildings];
            String[] heightStream = br.readLine().split(" ");
            int count = 0;

            if (buildings == 4) {
                sb.append(String.format("#%d %d\n", tc + 1, 0));
                continue;
            }

            for (int i = 0; i < buildings; i++) {
                heights[i] = Integer.parseInt(heightStream[i]);
            }

            for (int i = 2; i < buildings - 2; i++) {
                if (heights[i - 2] >= heights[i] || heights[i - 1] >= heights[i]
                        || heights[i + 1] >= heights[i] || heights[i + 2] >= heights[i]) {
                    continue;
                }

                count += heights[i] - Math.max((Math.max(Math.max(heights[i - 2], heights[i - 1]), heights[i + 1])), heights[i + 2]);
            }

            sb.append(String.format("#%d %d\n", tc + 1, count));
        }

        System.out.print(sb);
        br.close();
    }
}
