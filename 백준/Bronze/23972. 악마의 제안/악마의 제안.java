import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long pay = Long.parseLong(st.nextToken());
        long rate = Long.parseLong(st.nextToken());

        if (rate == 1L) {
            System.out.println(-1);
            return;
        }

        long min = (pay * rate) / (rate - 1L);

        if ((pay * rate) % (rate - 1L) != 0L) {
            min++;
        }

        System.out.println(min);
        br.close();
    }
}
