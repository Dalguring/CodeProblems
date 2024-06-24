import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            String number = String.valueOf(i).replaceAll("[^369]", "");
            if (number.length() == 0) {
                sb.append(i).append(" ");
            } else {
                sb.append(number.replaceAll("[369]", "-")).append(" ");
            }
        }
        System.out.println(sb);
        
        br.close();
    }
}
