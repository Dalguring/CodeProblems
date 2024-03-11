import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        boolean[] primeArray = new boolean[end + 1];
        int sum = 0;
        int min = Integer.MAX_VALUE;

        primeArray[0] = true;
        primeArray[1] = true;

        for (int i = 2; i < Math.sqrt(primeArray.length); i++) {
            if (!primeArray[i]) {
                for (int j = i * i; j < primeArray.length; j += i) {
                    primeArray[j] = true;
                }
            }
        }

        for (int i = start; i <= end; i++) {
            if (!primeArray[i]) {
                sum += i;
                min = Math.min(i, min);
            }
        }

        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
        
        br.close();
    }
}

