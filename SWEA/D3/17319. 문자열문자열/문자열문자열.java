import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int length = Integer.parseInt(br.readLine());
            String input = br.readLine();

            if (input.length() % 2 != 0) {
                sb.append(String.format("#%d %s\n", tc + 1, "No"));
                continue;
            }

            if (input.substring(0, input.length() / 2).equals(input.substring(input.length() / 2))) {
                sb.append(String.format("#%d %s\n", tc + 1, "Yes"));
            } else {
                sb.append(String.format("#%d %s\n", tc + 1, "No"));
            }
        }

        System.out.print(sb);
        br.close();
    }
}
