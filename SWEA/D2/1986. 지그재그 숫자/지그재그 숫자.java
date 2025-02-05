import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            int end = Integer.parseInt(br.readLine());
            int sum = 0;

            for (int j = 1; j <= end; j++) {
                if (j % 2 == 0) {
                    sum -= j;
                } else {
                    sum += j;
                }
            }

            sb.append(String.format("#%d %d", i + 1, sum)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}