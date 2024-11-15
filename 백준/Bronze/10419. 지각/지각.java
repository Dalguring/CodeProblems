import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int classTime = Integer.parseInt(br.readLine());
            int maxTime = 0;

            for (int j = 0; j < Math.sqrt(classTime); j++) {
                if (classTime >= j + Math.pow(j, 2)) {
                    maxTime = j;
                } else {
                    break;
                }
            }

            sb.append(maxTime).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
