import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        br.close();

        for (int i = 0; i < N; i++)
            array[i] = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Arrays.stream(array).filter(i -> i < X).forEach(i -> sb.append(i).append(" "));

        System.out.println(sb);
    }
}
