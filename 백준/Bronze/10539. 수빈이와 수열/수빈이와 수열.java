import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] indexMultiply = new int[t + 1];

        for (int i = 1; i < indexMultiply.length; i++) {
            indexMultiply[i] = i * Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < indexMultiply.length; i++) {
            sb.append(indexMultiply[i] - indexMultiply[i - 1]).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
