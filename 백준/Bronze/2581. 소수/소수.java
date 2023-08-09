import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int fromNum = Integer.parseInt(br.readLine());
        int toNum = Integer.parseInt(br.readLine());
        br.close();

        boolean[] isPrime = new boolean[toNum + 1];
        getPrime(isPrime, toNum);

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = fromNum; i <= toNum; i++) {
            if(!isPrime[i]) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        if(sum == 0) 
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    static boolean[] getPrime(boolean[] isPrime, int toNum) {
        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(toNum); i++) {
            if(!isPrime[i]) {
                for (int j = i * i; j <= toNum; j += i)
                    isPrime[j] = true;
            }
        }

        return isPrime;
    }
}
