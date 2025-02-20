import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            long number = Long.parseLong(br.readLine());
            Set<Integer> numberSet = new HashSet<>();
            int delta = 0;

            while (numberSet.size() != 10) {
                delta++;
                String.valueOf(number * delta).chars()
                        .forEach(numberSet::add);

            }

            sb.append(String.format("#%d %d\n", tc + 1, number * delta));
        }

        System.out.println(sb);
        br.close();
    }
}