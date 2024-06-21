import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        boolean[] isDivisor = new boolean[target];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= Math.sqrt(target); i++) {
            if (target % i == 0) {
                isDivisor[i - 1] = true;
                isDivisor[target / i - 1] = true;
            }
        }

        for (int i = 0; i < isDivisor.length; i++) {
            if (isDivisor[i]) {
                sb.append(i + 1).append(" ");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
