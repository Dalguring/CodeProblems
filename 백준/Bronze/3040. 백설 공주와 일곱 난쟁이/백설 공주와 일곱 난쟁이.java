import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfs = new int[9];
        StringBuilder sb = new StringBuilder();
        int total = 0;

        for (int i = 0; i < dwarfs.length; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            total += dwarfs[i];
        }
        br.close();

        OUTER:
        for (int i = 0; i < dwarfs.length - 1; i++) {
            for (int j = i + 1; j < dwarfs.length; j++) {
                if (total - dwarfs[i] - dwarfs[j] == 100) {
                    dwarfs[i] = -1;
                    dwarfs[j] = -1;
                    break OUTER;
                }
            }
        }

        for (int tall : dwarfs) {
            if (tall == -1) {
                continue;
            }
            sb.append(tall).append("\n");
        }

        System.out.println(sb);
    }
}
