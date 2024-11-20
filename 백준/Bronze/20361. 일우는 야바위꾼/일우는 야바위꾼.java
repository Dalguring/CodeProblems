import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cups = Integer.parseInt(st.nextToken());
        int ballPoint = Integer.parseInt(st.nextToken());
        int run = Integer.parseInt(st.nextToken());

        for (int i = 0; i < run; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            
            if (first == ballPoint || second == ballPoint) {
                ballPoint = ballPoint == first ? second : first;
            }
        }

        System.out.println(ballPoint);
        br.close();
    }
}
