import java.io.*;
import java.util.*;

public class Main {
    private static char[] charSet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num;

        while ((num = br.readLine()) != null) {
            int dashes = (int) Math.pow(3, Integer.parseInt(num));
            charSet = new char[dashes];
            Arrays.fill(charSet, '-');

            dfs(0, dashes);
            sb.append(charSet).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static void dfs(int start, int dashes) {
        if (dashes < 3) {
            return;
        }

        Arrays.fill(charSet, start + dashes / 3, start + dashes / 3 * 2, ' ');
        dfs(start, dashes / 3);
        dfs(start + dashes / 3 * 2, dashes / 3);
    }

}
