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
            int box1 = Integer.parseInt(st.nextToken());
            int box2 = Integer.parseInt(st.nextToken());
            int box3 = Integer.parseInt(st.nextToken());
            int candy = 0;

            if (box3 < 3 || box2 < 2) {
                sb.append(String.format("#%d %d\n", tc + 1, -1));
                continue;
            }

            if (box3 <= box2) {
                candy += box2 - (box3 - 1);
                box2 = box3 - 1;
            }

            if (box2 <= box1) {
                candy += box1 - (box2 - 1);
                box1 = box2 - 1;
            }

            sb.append(String.format("#%d %d\n", tc + 1, candy));
        }

        System.out.print(sb);
        br.close();
    }
}