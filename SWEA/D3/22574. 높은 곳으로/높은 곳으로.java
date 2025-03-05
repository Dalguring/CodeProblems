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
            int choice = Integer.parseInt(st.nextToken());
            int bomb = Integer.parseInt(st.nextToken());

            if (choice * (choice + 1) / 2 < bomb) {
                sb.append(choice * (choice + 1) / 2).append("\n");
                continue;
            }

            int accumulate = 0;
            boolean isStucked = false;

            for (int i = 1; i <= choice; i++) {
                accumulate += i;

                if (accumulate == bomb) {
                    isStucked = true;
                }
            }

            sb.append(isStucked ? (choice * (choice + 1) / 2) - 1 : (choice * (choice + 1) / 2)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}