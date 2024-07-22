import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCase = Integer.parseInt(br.readLine());
        Pattern pattern = Pattern.compile("O+");
        Matcher matcher;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalCase; i++) {
            matcher = pattern.matcher(br.readLine());
            int value = 0;

            while (matcher.find()) {
                int size = matcher.group().length();
                value += size * (1 + size) / 2;
            }

            sb.append(value).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
