import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int totalChickens = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chicken = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        howMany(chicken, coke, beer);

        System.out.println(totalChickens);
        br.close();
    }

    static void howMany(int chicken, int coke, int beer) {
        if (chicken <= 0 || (coke <= 1 && beer <= 0)) {
            return;
        }

        if (coke >= 2) {
            coke -= 2;
        } else if (beer > 0) {
            beer--;
        }

        totalChickens++;
        howMany(chicken - 1, coke, beer);
    }
}
