import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (String num : String.valueOf(N).split("")) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
