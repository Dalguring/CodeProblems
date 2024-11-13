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
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int total = 0;

            for (int j = 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    double number = (Math.pow(j, 2) + Math.pow(k, 2) + m) / (j * k);
                    if (number == (int) number) {
                        total++;
                    }
                }
            }

            sb.append(total).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
