import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("FBI");
        Matcher matcher;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            matcher = pattern.matcher(br.readLine());
            if (matcher.find()) {
                sb.append(i + 1).append(" ");
            }
        }

        if (sb.length() == 0) {
            sb.append("HE GOT AWAY!");
        }

        System.out.println(sb);
        br.close();
    }
}
