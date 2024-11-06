import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input;

        while (!(input = br.readLine()).equals("0 0 0")) {
            st = new StringTokenizer(input);
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());

            if (second - first == third - second) {
                sb.append("AP ").append(third + (third - second)).append("\n");
            } else {
                sb.append("GP ").append(third * (third / second)).append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
