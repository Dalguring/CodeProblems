import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            String pield = br.readLine();
            int count = 0;
            count += pield.charAt(0) == '(' || pield.charAt(0) == ')' ? 1 : 0;

            for (int i = 1; i < pield.length(); i++) {
                if (pield.charAt(i) == ')') {
                    if (pield.charAt(i - 1) == '(') {
                        continue;
                    }

                    count++;
                } else if (pield.charAt(i) == '(') {
                    count++;
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, count));
        }

        System.out.print(sb);
        br.close();
    }
}
