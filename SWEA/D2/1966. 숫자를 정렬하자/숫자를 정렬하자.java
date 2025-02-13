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
            int length = Integer.parseInt(br.readLine());
            sb.append(String.format("#%d ", tc + 1));
            Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .forEach(number -> sb.append(number).append(" "));

            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}