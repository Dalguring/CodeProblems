import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int[] array = new int[10];
            double sum = 0;

            for (int j = 0; j < 10; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(array);

            for (int j = 1; j <  9; j++) {
                sum += array[j];
            }

            sb.append(String.format("#%d %d", i + 1, (int) Math.round(sum / 8))).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}