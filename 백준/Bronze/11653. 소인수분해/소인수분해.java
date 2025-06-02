import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= Math.sqrt(input); i++) {
            while (input % i == 0) {
                sb.append(i).append("\n");
                input /= i;
            }
        }

        if (input != 1) {
            sb.append(input);
        }

        System.out.print(sb);
        br.close();
    }
}
