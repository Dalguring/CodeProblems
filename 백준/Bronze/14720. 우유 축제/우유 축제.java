import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int memory = 0;
        int count = 0;

        while (st.hasMoreTokens()) {
            if (memory == Integer.parseInt(st.nextToken())) {
                count += 1;
                memory++;
                memory %= 3;
            }
        }

        System.out.println(count);
        br.close();
    }
}