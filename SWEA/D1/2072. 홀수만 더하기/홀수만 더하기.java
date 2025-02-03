import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            String[] numbers = br.readLine().split(" ");
            int sum = Arrays.stream(numbers)
                    .mapToInt(Integer::parseInt)
                    .filter(num -> num % 2 != 0)
                    .sum();

            sb.append(String.format("#%d %d", i + 1, sum)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}