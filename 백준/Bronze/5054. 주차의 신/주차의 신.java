import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int visit = Integer.parseInt(br.readLine());
            int[] distances = new int[visit];
            st = new StringTokenizer(br.readLine());
            int minLocation = Integer.MAX_VALUE;
            int maxLocation = Integer.MIN_VALUE;
            int minDistance = Integer.MAX_VALUE;

            for (int j = 0; j < visit; j++) {
                distances[j] = Integer.parseInt(st.nextToken());
                minLocation = Math.min(distances[j], minLocation);
                maxLocation = Math.max(distances[j], maxLocation);
            }

            for (int distance : distances) {
                minDistance = Math.min(minDistance, (distance - minLocation) * 2 + (maxLocation - distance) * 2);
            }

            sb.append(minDistance).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
