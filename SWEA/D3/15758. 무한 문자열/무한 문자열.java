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
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if (s1.length() == s2.length()) {
                sb.append(String.format("#%d %s\n", tc + 1, s1.equals(s2) ? "yes" : "no"));
                continue;
            }

            int lcm = getGcd(s1.length(), s2.length()) * s1.length() * s2.length();
            int pointer1 = 0;
            int pointer2 = 0;
            boolean isMatch = true;

            for (int i = 0; i < lcm; i++) {
                pointer1 = pointer1 >= s1.length() ? pointer1 % s1.length() : pointer1;
                pointer2 = pointer2 >= s2.length() ? pointer2 % s2.length() : pointer2;

                if (s1.charAt(pointer1) != s2.charAt(pointer2)) {
                    isMatch = false;
                    break;
                }

                pointer1++;
                pointer2++;
            }

            sb.append(String.format("#%d %s\n", tc + 1, isMatch ? "yes" : "no"));
        }

        System.out.print(sb);
        br.close();
    }

    static int getGcd(int s1, int s2) {
        if (s1 % s2 == 0) {
            return s2;
        }

        return getGcd(s2, s1 % s2);
    }
}
