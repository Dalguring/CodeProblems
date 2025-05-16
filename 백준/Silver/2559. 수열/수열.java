import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        int serial = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] temperature = new int[days];
        int max = 0;
        int partialSum = 0;

        for (int i = 0; i < days; i++) {
            temperature[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < serial; i++) {
            max += temperature[i];
        }

        partialSum = max;

        for (int i = 1; i <= days - serial; i++) {
            partialSum = partialSum - temperature[i - 1] + temperature[serial + i - 1];
            max = Math.max(max, partialSum);
        }

        System.out.println(max);
        br.close();
    }
}