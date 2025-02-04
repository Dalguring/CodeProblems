import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            String[] numbers = br.readLine().split(" ");
            int count = 0;
            long smaller = Math.min(Long.parseLong(numbers[0]), Long.parseLong(numbers[1]));
            long bigger = Math.max(Long.parseLong(numbers[0]), Long.parseLong(numbers[1]));
            long target = Long.parseLong(numbers[2]);

            while (bigger <= target) {
                count++;
                long temp = bigger;
                bigger += smaller;
                smaller = temp;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}