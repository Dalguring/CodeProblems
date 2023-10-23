import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder(st.nextToken());
        int A = Integer.parseInt(sb.reverse().toString());
        sb.delete(0, sb.length());
        int B = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());

        System.out.println(Math.max(A, B));
    }
}
