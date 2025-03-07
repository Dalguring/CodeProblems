import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int fibonacciNums = Integer.parseInt(br.readLine());

            int repeat = fibonacciNums / 3;
            int left = fibonacciNums % 3;

            if (left == 1) {
                sb.append("impossible").append("\n");
                continue;
            } else if (left == 2) {
                sb.append("BA");
            }

            for (int i = 0; i < repeat; i++) {
                sb.append("BBA");
            }

            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}