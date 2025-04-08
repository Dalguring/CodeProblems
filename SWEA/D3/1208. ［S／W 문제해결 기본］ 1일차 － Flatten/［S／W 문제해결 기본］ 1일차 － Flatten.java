import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    static int[] heights;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < 10; tc++) {
            int dump = Integer.parseInt(br.readLine());
            heights = new int[100];
            String[] boxHeight = br.readLine().split(" ");

            for (int i = 0; i < 100; i++) {
                heights[i] = Integer.parseInt(boxHeight[i]);
            }

            Arrays.sort(heights);

            for (int i = 0; i < dump; i++) {
                if (heights[0] + 1 == heights[99] || heights[0] == heights[99]) {
                    sb.append(String.format("#%d %d\n", tc + 1, heights[99] - heights[0]));
                    break;
                }

                heights[0]++;
                heights[99]--;
                swapMin();
                swapMax();
            }

            sb.append(String.format("#%d %d\n", tc + 1, heights[99] - heights[0]));
        }

        System.out.print(sb);
        br.close();
    }

    static void swapMin() {
        int index = 0;

        while (heights[index] > heights[index + 1]) {
            int temp = heights[index + 1];
            heights[index + 1] = heights[index];
            heights[index] = temp;

            index++;
        }
    }

    static void swapMax() {
        int index = 99;

        while (heights[index] < heights[index - 1]) {
            int temp = heights[index - 1];
            heights[index - 1] = heights[index];
            heights[index] = temp;

            index--;
        }
    }
}
