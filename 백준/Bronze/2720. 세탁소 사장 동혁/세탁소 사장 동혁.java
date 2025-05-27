import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int change;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            change = Integer.parseInt(br.readLine());
            sb.append(getShare(25)).append(" ");
            sb.append(getShare(10)).append(" ");
            sb.append(getShare(5)).append(" ");
            sb.append(getShare(1)).append("\n");
        }

        System.out.print(sb);
        br.close();
    }

    static int getShare(int divider) {
        int share = change / divider;
        change %= divider;

        return share;
    }
}
