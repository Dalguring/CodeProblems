import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = gcd(Math.max(a, b), Math.min(a, b));

        System.out.println(gcd);
        System.out.println(a / gcd * b / gcd * gcd);
        
        br.close();
    }

    static int gcd(int larger, int smaller) {
        if (larger % smaller == 0) {
            return smaller;
        }

        return gcd(smaller, larger % smaller);
    }
}
