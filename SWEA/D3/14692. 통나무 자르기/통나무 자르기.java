import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            long length = Long.parseLong(br.readLine());
            sb.append(String.format("#%d %s\n", tc + 1, length % 2 == 0 ? "Alice" : "Bob"));
        }

        System.out.print(sb);
        br.close();
    }
}
