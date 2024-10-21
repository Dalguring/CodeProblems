import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher matcher;

        while (!(input = br.readLine()).equals("#")) {
            matcher = pattern.matcher(input);
            sb.append(matcher.results().count()).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
