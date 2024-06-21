import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        br.close();

        for (int i = 0; i <= input; i++) {
            sb.append(1 << i).append(" ");
        }

        System.out.println(sb);
    }
}
