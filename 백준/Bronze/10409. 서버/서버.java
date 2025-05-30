import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int works = 0;

        while (st.hasMoreTokens()) {
            time -= Integer.parseInt(st.nextToken());

            if (time < 0) {
                break;
            }
            works++;
        }

        System.out.println(works);
        br.close();
    }
}
