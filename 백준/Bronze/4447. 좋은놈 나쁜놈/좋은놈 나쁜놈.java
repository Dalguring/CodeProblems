import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern goodPattern = Pattern.compile("g", Pattern.CASE_INSENSITIVE);
        Pattern badPattern = Pattern.compile("b", Pattern.CASE_INSENSITIVE);
        Matcher goodMatcher;
        Matcher badMatcher;

        int names = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < names; i++) {
            String input = br.readLine();
            goodMatcher = goodPattern.matcher(input);
            badMatcher = badPattern.matcher(input);
            long result = goodMatcher.results().count() - badMatcher.results().count();

            if (result > 0) {
                sb.append(input).append(" is GOOD").append("\n");
            } else if (result < 0) {
                sb.append(input).append(" is A BADDY").append("\n");
            } else {
                sb.append(input).append(" is NEUTRAL").append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
