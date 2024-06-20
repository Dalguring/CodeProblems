import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            List<Integer> numList = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                numList.add(Integer.parseInt(st.nextToken()));
            }

            int sum = numList.stream()
                    .filter(num -> num % 2 != 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.printf("#%d %d", i + 1, sum);
            System.out.println();
        }
    }
}
