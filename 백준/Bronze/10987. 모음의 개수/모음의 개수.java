import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        Pattern vowels = Pattern.compile("[aeiou]");
        Matcher vowelMatcher = vowels.matcher(sentence);

        long vowelCount = vowelMatcher.results().count();
        System.out.println(vowelCount);

        br.close();
    }
}
