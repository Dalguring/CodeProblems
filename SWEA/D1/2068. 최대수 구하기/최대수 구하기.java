import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            List<Integer> numList = new ArrayList<>();

            while (st.hasMoreTokens()) {
                numList.add(Integer.parseInt(st.nextToken()));
            }

            OptionalInt num = numList.stream()
                    .mapToInt(Integer::intValue)
                    .max();

            sb.append(String.format("#%d %d", i + 1, num.getAsInt())).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
