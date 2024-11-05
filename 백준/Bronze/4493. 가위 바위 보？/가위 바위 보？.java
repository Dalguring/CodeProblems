import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCases = Integer.parseInt(br.readLine());

        Map<String, String> winMap = new HashMap<>();
        winMap.put("R", "S");
        winMap.put("P", "R");
        winMap.put("S", "P");

        for (int i = 0; i < testCases; i++) {
            int rounds = Integer.parseInt(br.readLine());
            int player1Wins = 0;
            int player2Wins = 0;

            for (int j = 0; j < rounds; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();

                if (p1.equals(p2)) {
                    continue;
                }

                if (winMap.get(p1).equals(p2)) {
                    player1Wins++;
                } else {
                    player2Wins++;
                }
            }

            if (player1Wins > player2Wins) {
                sb.append("Player 1\n");
            } else if (player2Wins > player1Wins) {
                sb.append("Player 2\n");
            } else {
                sb.append("TIE\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
