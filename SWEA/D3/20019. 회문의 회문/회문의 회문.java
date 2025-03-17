import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            boolean isPalindrome = true;
            String string = br.readLine();

            for (int i = 0; i < string.length(); i++) {
                isPalindrome = string.charAt(i) == string.charAt(string.length() - 1 - i);
                if (!isPalindrome) break;
            }

            if (!isPalindrome) {
                sb.append(String.format("#%d %s\n", tc + 1, "NO"));
                continue;
            }

            String sub1 = string.substring(0, string.length() / 2);

            for (int i = 0; i < sub1.length(); i++) {
                isPalindrome = sub1.charAt(i) == sub1.charAt(sub1.length() - 1 - i);
                if (!isPalindrome) break;
            }

            if (!isPalindrome) {
                sb.append(String.format("#%d %s\n", tc + 1, "NO"));
                continue;
            }

            String sub2 = string.substring(string.length() / 2 + 1);

            for (int i = 0; i < sub2.length(); i++) {
                isPalindrome = sub2.charAt(i) == sub2.charAt(sub2.length() - 1 - i);
                if (!isPalindrome) break;
            }

            if (!isPalindrome) {
                sb.append(String.format("#%d %s\n", tc + 1, "NO"));
                continue;
            }

            sb.append(String.format("#%d %s\n", tc + 1, "YES"));
        }

        System.out.print(sb);
        br.close();
    }
}