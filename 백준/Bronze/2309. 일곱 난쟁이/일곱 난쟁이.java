import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfTall = new int[9];
        int total = 0;
        boolean isOver = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            dwarfTall[i] = Integer.parseInt(br.readLine());
            total += dwarfTall[i];
        }

        for (int i = 0; i < 8; i++) {
            if (isOver) {
                break;
            }
            for (int j = i + 1; j < 9; j++) {
                if (total - dwarfTall[i] - dwarfTall[j] == 100) {
                    dwarfTall[i] = -1;
                    dwarfTall[j] = -1;
                    isOver = true;
                }
            }
        }

        Arrays.sort(dwarfTall);
        for (int i = 2; i < 9; i++) {
            sb.append(dwarfTall[i]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
