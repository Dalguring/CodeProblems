import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pre = Integer.MIN_VALUE;

        while (st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());

            if (pre > now) {
                System.out.println("Bad");
                return;
            }
            pre = now;
        }

        System.out.println("Good");
        br.close();
    }
}
