import java.io.*;
import java.util.*;

public class Main {
    static boolean[] broken = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if (m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < m; i++) {
                broken[Integer.parseInt(st.nextToken())] = true;
            }
        }

        int minPress = Math.abs(target - 100);

        for (int i = 0; i <= 1000000; i++) {
            int len = possible(i);

            if (len > 0) {
                int press = len + Math.abs(target - i);
                minPress = Math.min(minPress, press);
            }
        }

        System.out.println(minPress);
    }

    static int possible(int n) {
        if (n == 0) {
            return broken[0] ? 0 : 1;
        }

        int len = 0;

        while (n > 0) {
            if (broken[n % 10]) return 0;
            len++;
            n /= 10;
        }

        return len;
    }
}