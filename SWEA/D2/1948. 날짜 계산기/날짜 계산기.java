import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());
        Map<Integer, Integer> dateMap = new HashMap<>();

        dateMap.put(1, 31);
        dateMap.put(2, 28);
        dateMap.put(3, 31);
        dateMap.put(4, 30);
        dateMap.put(5, 31);
        dateMap.put(6, 30);
        dateMap.put(7, 31);
        dateMap.put(8, 31);
        dateMap.put(9, 30);
        dateMap.put(10, 31);
        dateMap.put(11, 30);
        dateMap.put(12, 31);

        for (int tc = 0; tc < testcase; tc++) {
            String[] input = br.readLine().split(" ");
            int dateDiff = 0;
            int month1 = Integer.parseInt(input[0]);
            int date1 = Integer.parseInt(input[1]);
            int month2 = Integer.parseInt(input[2]);
            int date2 = Integer.parseInt(input[3]);

            if (month1 == month2) {
                dateDiff = date2 - date1 + 1;
            } else {
                if (month2 - month1 == 1) {
                    dateDiff = dateMap.get(month1) - date1 + 1 + date2;
                } else {
                    dateDiff = dateMap.get(month1) - date1 + 1 + date2;

                    for (int i = month1 + 1; i < month2; i++) {
                        dateDiff += dateMap.get(i);
                    }
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, dateDiff));
        }

        System.out.println(sb);
        br.close();
    }
}