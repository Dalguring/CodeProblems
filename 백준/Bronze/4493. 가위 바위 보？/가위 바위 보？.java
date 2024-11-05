import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            int t = Integer.parseInt(br.readLine());
            int define = 0;

            for (int j = 0; j < t; j++) {
                st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();

                if (p1.equals("R") && p2.equals("P")) {
                    define--;
                } else if (p1.equals("R") && p2.equals("S")) {
                    define++;
                } else if (p1.equals("P") && p2.equals("R")) {
                    define++;
                } else if (p1.equals("P") && p2.equals("S")) {
                    define--;
                } else if (p1.equals("S") && p2.equals("R")) {
                    define--;
                } else if (p1.equals("S") && p2.equals("P")) {
                    define++;
                }
            }

            if (define < 0) {
                sb.append("Player 2").append("\n");
            } else if (define > 0) {
                sb.append("Player 1").append("\n");
            } else {
                sb.append("TIE").append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
