import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String id = String.format(":%s:", br.readLine());
        String fan = ":fan:";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    sb.append(id);
                    continue;
                }
                sb.append(fan);
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
