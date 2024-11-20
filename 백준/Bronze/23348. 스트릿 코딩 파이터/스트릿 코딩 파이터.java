import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int oneHand = Integer.parseInt(st.nextToken());
        int noLook = Integer.parseInt(st.nextToken());
        int phone = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        int maxScore = 0;

        for (int i = 0; i < t; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                sum += Integer.parseInt(st.nextToken()) * oneHand;
                sum += Integer.parseInt(st.nextToken()) * noLook;
                sum += Integer.parseInt(st.nextToken()) * phone;
            }

            maxScore = Math.max(maxScore, sum);
        }

        System.out.println(maxScore);
        br.close();
    }
}
