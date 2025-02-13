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
            int max = 0;
            br.readLine();
            int[] a = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            int[] b = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            if (a.length >= b.length) {
                for (int i = 0; i <= a.length - b.length; i++) {
                    int sum = 0;

                    for (int j = i; j < i + b.length; j++) {
                        sum += a[j] * b[j - i];
                    }

                    max = Math.max(max, sum);
                }
            } else {
                for (int i = 0; i <= b.length - a.length; i++) {
                    int sum = 0;

                    for (int j = i; j < i + a.length; j++) {
                        sum += a[j - i] * b[j];
                    }

                    max = Math.max(max, sum);
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, max));
        }

        System.out.println(sb);
        br.close();
    }
}