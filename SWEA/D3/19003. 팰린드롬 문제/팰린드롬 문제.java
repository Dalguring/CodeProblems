import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            st = new StringTokenizer(br.readLine());
            int strings = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            int max = 0;
            int count = 0;
            int palindrome = 0;
            Set<String> stringSet = new HashSet<>();

            for (int i = 0; i < strings; i++) {
                stringSet.add(br.readLine());
            }

            Iterator<String> iterator = stringSet.iterator();
            while (iterator.hasNext()) {
                StringBuilder builder = new StringBuilder();
                String string = iterator.next();

                if (isPalindrome(string)) {
                    max = Math.max(max, length);
                    palindrome++;
                } else {
                    count += stringSet.contains(builder.append(string).reverse().toString()) ? 1 : 0;
                }

            }

            if (count != 0) {
                int size = palindrome > 0 ? count * length + length : count * length;
                max = Math.max(size, max);
            }

            sb.append(String.format("#%d %d\n", tc + 1, max));
        }

        System.out.print(sb);
        br.close();
    }

    static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}