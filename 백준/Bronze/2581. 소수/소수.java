import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = 10000;
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = start; i <= end; i++) {
            if (isPrime[i]) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (sum == 0) {
            System.out.print(-1);
            return;
        }

        sb.append(sum).append("\n");
        sb.append(min);

        System.out.print(sb);
        br.close();
    }
}