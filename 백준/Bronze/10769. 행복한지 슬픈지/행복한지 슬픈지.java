import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        Pattern happy = Pattern.compile(":-\\)");
        Pattern sad = Pattern.compile(":-\\(");

        Matcher happyMatcher = happy.matcher(sentence);
        Matcher sadMatcher = sad.matcher(sentence);

        long happyCnt = happyMatcher.results().count();
        long sadCnt = sadMatcher.results().count();

        if (happyCnt == 0 && sadCnt == 0) {
            System.out.println("none");
        } else if (happyCnt == sadCnt) {
            System.out.println("unsure");
        } else if (happyCnt > sadCnt) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }

        br.close();
    }
}
