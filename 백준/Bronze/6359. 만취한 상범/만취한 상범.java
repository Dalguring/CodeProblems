import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        boolean[] jailClosed;

        for (int i = 0; i < t; i++) {
            int room = Integer.parseInt(br.readLine());
            jailClosed = new boolean[room];
            int opened = 0;

            for (int j = 2; j <= room; j++) {
                int temp = j;

                while (temp <= room) {
                    jailClosed[temp - 1] = !jailClosed[temp - 1];
                    temp += j;
                }
            }

            for (boolean isClosed : jailClosed) {
                if (!isClosed) {
                    opened++;
                }
            }

            sb.append(opened).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
