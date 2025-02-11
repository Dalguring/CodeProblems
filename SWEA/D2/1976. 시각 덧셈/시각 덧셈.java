import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            st = new StringTokenizer(br.readLine());
            int hour1 = Integer.parseInt(st.nextToken());
            int minute1 = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());
            int minute2 = Integer.parseInt(st.nextToken());

            int[] calcResult = calcMinute(minute1, minute2);
            int calcHour = calcResult[0] + hour1 + hour2 <= 12 ? calcResult[0] + hour1 + hour2 : calcResult[0] + hour1 + hour2 - 12;

            sb.append(String.format("#%d %d %d\n", tc + 1, calcHour, calcResult[1]));
        }

        System.out.println(sb);
        br.close();
    }

    static int[] calcMinute(int minute1, int minute2) {
        return minute1 + minute2 < 60 ? new int[]{0, minute1 + minute2} : new int[]{1, minute1 + minute2 - 60};
    }
}