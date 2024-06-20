import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            List<Integer> numList = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                numList.add(Integer.parseInt(st.nextToken()));
            }

            double average = numList.stream()
                    .collect(Collectors.averagingInt(Integer::intValue));

            sb.append(String.format("#%d %d", i + 1, (int) Math.round(average))).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
