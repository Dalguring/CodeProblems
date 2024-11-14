import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int spaceship = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            int canReach = 0;

            for (int j = 0; j < spaceship; j++) {
                st = new StringTokenizer(br.readLine());
                int maxSpeed = Integer.parseInt(st.nextToken());
                int fuel = Integer.parseInt(st.nextToken());
                double fuelConsumptionRate = Double.parseDouble(st.nextToken());

                if (distance <= maxSpeed * (fuel / fuelConsumptionRate)) {
                    canReach++;
                }
            }

            sb.append(canReach).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
