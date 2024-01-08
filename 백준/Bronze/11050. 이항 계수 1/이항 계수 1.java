import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(fac(N) / (fac(N - K) * fac(K)));
        br.close();
    }

    static int fac(int num) {
        if (num < 1)
            return 1;

        return num * fac(num - 1);
    }
}
