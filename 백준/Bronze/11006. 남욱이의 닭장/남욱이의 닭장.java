import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int legs = Integer.parseInt(st.nextToken());
            int chickens = Integer.parseInt(st.nextToken());

            sb.append(chickens * 2 - legs).append(" ").append(chickens - (chickens * 2 - legs)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
