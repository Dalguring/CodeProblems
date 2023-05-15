import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while(N / B < N) {
            if(N % B > 9) {
                sb.append((char)(N % B + 55));
                N = N / B;
            } else if(N % B <= 9) {
                sb.append(N % B);
                N = N / B;
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
