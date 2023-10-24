import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cycle = 0;
        int stackSum = 1;
        br.close();

        while (N > stackSum) {
            stackSum += 6 * cycle;
            cycle++;
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(cycle);
    }
}
