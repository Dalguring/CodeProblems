import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());
        double e = Double.parseDouble(st.nextToken());
        double f = Double.parseDouble(st.nextToken());

        int y = (int) ((c * d - a * f) / (b * d - a * e));
        System.out.printf("%d %d", (int) ((c * e - b * f) / (a * e - b * d)), y);

        br.close();
    }
}
