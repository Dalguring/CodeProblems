import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        int pointX = 0;
        int pointY = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }

        for (int key : xMap.keySet()) {
            if (xMap.get(key) == 1) {
                pointX = key;
            }
        }
        for (int key : yMap.keySet()) {
            if (yMap.get(key) == 1) {
                pointY = key;
            }
        }

        System.out.printf("%d %d", pointX, pointY);
        br.close();
    }
}
