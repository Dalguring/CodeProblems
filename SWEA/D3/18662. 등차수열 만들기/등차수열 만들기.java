import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            st = new StringTokenizer(br.readLine());
            double first = Double.parseDouble(st.nextToken());
            double second = Double.parseDouble(st.nextToken());
            double third = Double.parseDouble(st.nextToken());
            double answer = 0;

            double difference = (third - first) / 2;

            if (second - first == difference) {
                answer = third - (second + difference);
            } else if (third - second == difference) {
                answer = first - (second - difference);
            } else {
                answer = second - (first + difference);
            }

            sb.append(String.format("#%d %.1f\n", tc + 1, Math.abs(answer)));
        }

        System.out.print(sb);
        br.close();
    }
}
