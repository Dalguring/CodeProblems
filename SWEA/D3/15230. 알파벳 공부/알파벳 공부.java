import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int count = 0;
            String sequence = br.readLine();
            char c = 'a';

            for (int i = 0; i < sequence.length(); i++) {
                if (sequence.charAt(i) == c) {
                    c++;
                    count++;
                } else {
                    break;
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, count));
        }

        System.out.print(sb);
        br.close();
    }
}
