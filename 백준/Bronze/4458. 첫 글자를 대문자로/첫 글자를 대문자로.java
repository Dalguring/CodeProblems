import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String sentence = br.readLine();
            sb.append(sentence.substring(0, 1).toUpperCase()
                    .concat(sentence.substring(1)))
                    .append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
