import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int streetDistance = Integer.parseInt(br.readLine());
        int[] hill = new int[streetDistance + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = 0;
        int end = 0;
        int maxHill = 0;

        for (int i = 0; i < streetDistance; i++) {
            hill[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < streetDistance; i++) {
            if (hill[end] >= hill[i + 1]) {
                if (hill[start] < hill[end]) {
                    maxHill = Math.max(maxHill, hill[end] - hill[start]);
                }
                start = i + 1;
            }
            end = i + 1;
        }

        System.out.println(maxHill);
        br.close();
    }
}
