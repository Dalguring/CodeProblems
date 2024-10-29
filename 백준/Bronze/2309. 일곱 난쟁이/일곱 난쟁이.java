import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static boolean[] visited = new boolean[9];
    static int[] dwarfTall = new int[9];
    static List<Integer> dwarfs = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            dwarfTall[i] = Integer.parseInt(br.readLine());
        }

        getTall(0, 0, 0);
        br.close();
    }

    static void getTall(int start, int tall, int confirmed) {
        if (confirmed == 7) {
            if (tall == 100) {
                for (int i = 0; i < 9; i++) {
                    if (visited[i]) dwarfs.add(dwarfTall[i]);
                }

                Collections.sort(dwarfs);
                for (int height : dwarfs) {
                    System.out.println(height);
                }

                System.exit(0);
            }
            return;
        }

        for (int i = start; i < 9; i++) {
            if (!visited[i]) {
                visited[i] = true;
                getTall(i + 1, tall + dwarfTall[i], confirmed + 1);
                visited[i] = false;
            }
        }
    }
}
