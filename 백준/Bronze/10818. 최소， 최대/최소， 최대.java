import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            max = Math.max(max, target);
            min = Math.min(min, target);
        }

        System.out.println(min + " " + max);
    }
}
