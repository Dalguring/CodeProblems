import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int e = 0;
        int s = 0;
        int m = 0;
        long year = 0L;

        while (x != e || y != s || z != m) {
            year++;
            e++;
            s++;
            m++;

            if (e % 16 == 0) {
                e = 1;
            }
            if (s % 29 == 0) {
                s = 1;
            }
            if (m % 20 == 0) {
                m = 1;
            }
        }

        System.out.println(year);
    }
}
