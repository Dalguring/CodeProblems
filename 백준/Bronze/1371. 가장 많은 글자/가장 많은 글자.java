import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabetCount = new int['z' - 'a' + 1];
        int max;
        String input;

        while ((input = br.readLine()) != null) {
            for (char c : input.toCharArray()) {
                if (c == ' ') {
                    continue;
                }
                alphabetCount[c - 'a']++;
            }
        }

        max = Arrays.stream(alphabetCount)
                .max().getAsInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alphabetCount.length; i++) {
            if (alphabetCount[i] == max) {
                char c = (char)('a' + i);
                sb.append(c);
            }
        }

        System.out.println(sb);
        br.close();
    }
}
