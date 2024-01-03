import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean[] primes = new boolean[10000001];
        for (int i = 2; i <= Math.sqrt(primes.length); i++) {
            if (primes[i])
                continue;
            for (int j = i * i; j < primes.length; j += i) {
                primes[j] = true;
            }
        }

        for (int i = 0; i < testCase; i++) {
            int count = 0;
            int target = Integer.parseInt(br.readLine());
            for (int j = 2; j <= target / 2; j++) {
                if (!primes[j] && !primes[target - j])
                    count++;
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

}
