import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int pre = 1;
        int next = 1;
        int fib = 0;

        for (int i = 3; i <= N; i++) {
            fib = pre + next;
            pre = next;
            next = fib;
        }

        System.out.printf("%d %d", fib, N - 2);
        br.close();
    }
}