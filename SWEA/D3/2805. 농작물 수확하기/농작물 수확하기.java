import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int size = Integer.parseInt(br.readLine());
            int delta = 0;
            int direction = 1;
            int sum = 0;

            for (int i = 0; i < size; i++) {
                sum += Arrays.stream(br.readLine().substring(size / 2 - delta, size / 2 + delta + 1)
                        .split(""))
                        .mapToInt(Integer::parseInt)
                        .sum();

                if (delta == size / 2) {
                    direction = -1;
                }

                if (direction == 1) {
                    delta++;
                } else {
                    delta--;
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, sum));
        }

        System.out.print(sb);
        br.close();
    }
}
