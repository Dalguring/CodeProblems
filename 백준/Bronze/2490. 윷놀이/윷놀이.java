import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] results;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            results = new int[2];

            while (st.hasMoreTokens()) {
                results[Integer.parseInt(st.nextToken())]++;
            }

            int bae = results[0];
            char result;

            switch (bae) {
                case 0: result = 'E'; break;
                case 1: result = 'A'; break;
                case 2: result = 'B'; break;
                case 3: result = 'C'; break;
                case 4: result = 'D'; break;
                default: result = ' ';
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
