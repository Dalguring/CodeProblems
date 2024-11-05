import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int standard = Integer.parseInt(br.readLine());
        int judged;

        while ((judged = Integer.parseInt(br.readLine())) != 0) {
            if (judged % standard == 0) {
                sb.append(String.format("%d is a multiple of %d.\n", judged, standard));
            } else {
                sb.append(String.format("%d is NOT a multiple of %d.\n", judged, standard));
            }
        }

        System.out.println(sb);
        br.close();
    }
}
