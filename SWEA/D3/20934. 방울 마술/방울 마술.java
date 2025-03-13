import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            String[] bellInformation = br.readLine().split(" ");
            int now = bellInformation[0].indexOf("o");
            int ringCount = Integer.parseInt(bellInformation[1]);

            if (ringCount == 0) {
                sb.append(String.format("#%d %d\n", tc + 1, now));
                continue;
            }

            for (int i = 0; i < ringCount; i++) {
                if (now == 0 || now == 2) {
                    now = 1;
                } else {
                    now = 0;
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, now));
        }

        System.out.print(sb);
        br.close();
    }
}