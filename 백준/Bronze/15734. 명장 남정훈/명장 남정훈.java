import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int left = Integer.parseInt(st.nextToken());
        int right = Integer.parseInt(st.nextToken());
        int all = Integer.parseInt(st.nextToken());

        while (left != right && all > 0) {
            if (left < right) {
                left++;
            } else {
                right++;
            }
            all--;
        }

        if (left != right) {
            System.out.println(Math.min(left, right) * 2);
        } else {
            System.out.println((left + all / 2) * 2);
        }

        br.close();
    }
}
