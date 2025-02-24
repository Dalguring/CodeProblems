import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            br.readLine();
            st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> scoreMap = new LinkedHashMap<>();

            while (st.hasMoreTokens()) {
                int score = Integer.parseInt(st.nextToken());
                scoreMap.put(score, scoreMap.getOrDefault(score, 0) + 1);
            }

            List<Integer> keyList = new ArrayList<>(scoreMap.keySet());
            keyList.sort((o1, o2) -> scoreMap.get(o2) - scoreMap.get(o1));

            sb.append(String.format("#%d %d\n", tc + 1, keyList.get(0)));
        }

        System.out.println(sb);
        br.close();
    }
}