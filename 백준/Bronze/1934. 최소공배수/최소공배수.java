import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A * B / gcd(A, B) + "\n");
        }
        br.close();
        System.out.println(sb);
    }

    static int gcd(int A, int B) {
        if(B % A == 0)
            return A;

        return gcd(B % A, A);
    }
}
