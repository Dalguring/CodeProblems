import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long time = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long birds = Long.parseLong(br.readLine());

        timeTaken(birds, 1);

        System.out.println(time);
        br.close();
    }

    static long timeTaken(long birds, long song) {
        if (birds == 0) {
            return 1;
        }
        if (song > birds) {
            return timeTaken(birds, 1);
        }
        time++;

        return timeTaken(birds - song, song + 1);
    }
}
