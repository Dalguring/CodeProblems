import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Pattern pattern;
        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals("#")) {
            String delim = input.substring(0, 1);
            String sentence = input.substring(2).toLowerCase();

            pattern = Pattern.compile(delim);
            Matcher matcher = pattern.matcher(sentence);
            sb.append(delim).append(" ").append(matcher.results().count()).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
