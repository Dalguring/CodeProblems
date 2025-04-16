import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            String input = br.readLine();
            int bit = 0;
            int count = 0;

            for (int i = 0; i < input.length(); i++) {
                int bitNumber = Character.getNumericValue(input.charAt(i));

                if (bit != bitNumber) {
                    bit = bitNumber;
                    count++;
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, count));
        }

        System.out.print(sb);
        br.close();
    }
}
