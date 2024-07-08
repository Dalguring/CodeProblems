import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        br.close();

        for (int i = 0; i < word.length(); i += 10) {
            if (word.length() < i + 10) {
                sb.append(word.substring(i));
                break;
            }
            sb.append(word, i, i + 10).append("\n");
        }

        System.out.println(sb);
    }
}