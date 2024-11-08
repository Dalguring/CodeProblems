import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] exists;
        String input;

        while (!(input = br.readLine()).equals("*")) {
            exists = new boolean['z' - 'a' + 1];
            boolean allExists = true;

            for (char c : input.toCharArray()) {
                if (c == ' ') {
                    continue;
                }
                exists[c - 'a'] = true;
            }

            for (boolean b : exists) {
                if (!b) {
                    allExists = false;
                    break;
                }
            }

            if (allExists) {
                sb.append("Y\n");
            } else {
                sb.append("N\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
