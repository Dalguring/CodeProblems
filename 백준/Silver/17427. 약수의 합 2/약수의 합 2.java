import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long answer = 0L;

        for (int i = 1; i <= N; i++) {
            answer += i * (long) (N / i);
        }

        System.out.println(answer);
        br.close();
    }
}
