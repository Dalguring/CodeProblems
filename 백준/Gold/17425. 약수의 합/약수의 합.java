import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long[] prefixSum = new long[1000001];

        for (int i = 1; i <= 1000000; i++) {
            for (int j = i; j <= 1000000; j += i) {
                prefixSum[j] += i;
            }
        }

        for (int i = 1; i <= 1000000; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }

        for (int i = 0; i < T; i++) {
            int number = Integer.parseInt(br.readLine());
            sb.append(prefixSum[number]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
