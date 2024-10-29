import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long first = Math.min(a, b);
        long second = Math.max(a, b);
        long count = second - first + 1;

        System.out.println(count * (first + second) / 2);
    }
}
