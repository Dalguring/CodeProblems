import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String num = br.readLine();

            if (Integer.parseInt(num.substring(num.length() - 1)) % 2 == 0) {
                sb.append("even\n");
            } else {
                sb.append("odd\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
