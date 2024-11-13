import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double distance = Double.parseDouble(st.nextToken());
            double speedA = Double.parseDouble(st.nextToken());
            double speedB = Double.parseDouble(st.nextToken());
            double speedFly = Double.parseDouble(st.nextToken());

            double answer = distance / (speedA + speedB) * speedFly;
            sb.append(i + 1).append(String.format(" %.6f", answer)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
