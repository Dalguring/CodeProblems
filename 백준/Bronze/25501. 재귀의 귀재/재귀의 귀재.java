import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cycle = 0;
    static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            int isPalindrome = isPalindrome(word, 0, word.length() - 1);
            sb.append(isPalindrome).append(" ").append(cycle).append("\n");

            cycle = 0;
        }

        System.out.println(sb);
        br.close();
    }

    static int isPalindrome(String word, int left, int right) {
        cycle++;

        if (left >= right) {
            return 1;
        } else if (word.charAt(left) != word.charAt(right)) {
            return 0;
        }


        return isPalindrome(word, left + 1, right - 1);
    }
}
