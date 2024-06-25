import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String word = br.readLine();
            int left = 0;
            int right = word.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                appendString(i, 1);
            } else {
                appendString(i, 0);
            }
        }

        System.out.println(sb);
        br.close();
    }

    static void appendString(int index, int number) {
        sb.append(String.format("#%d %d", index + 1, number)).append("\n");
    }
}
