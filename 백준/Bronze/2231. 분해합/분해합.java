import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        br.close();

        for (int i = 1; i < N; i++) {
            int length = String.valueOf(i).length() - 1;
            int plus = 0;
            int num = i;
            while (length >= 0) {
                plus += num / (int)Math.pow(10, length);
                num %= (int)Math.pow(10, length);
                length--;
            }
            if (i + plus == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}