import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while ((input = br.readLine()) != null) {
            int divider = Integer.parseInt(input);
            int target = 1;
            int oneCount = 1;

            while (target % divider != 0) {
                oneCount++;
                target = (target * 10 + 1) % divider;
            }

            sb.append(oneCount).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
