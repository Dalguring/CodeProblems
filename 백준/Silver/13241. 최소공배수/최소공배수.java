import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if(A > B)
            System.out.println(A * B / gcd(A, B));
        else
            System.out.println(A * B / gcd(B, A));

    }

    static long gcd(long A, long B) {
        if(A % B == 0)
            return B;
        return gcd(B, A % B);
    }
}
