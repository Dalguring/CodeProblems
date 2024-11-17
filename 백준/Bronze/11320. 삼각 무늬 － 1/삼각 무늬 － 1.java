import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int larger = Integer.parseInt(st.nextToken());
            int smaller = Integer.parseInt(st.nextToken());
            int triangles = 0;

            for (int j = 1; j <= larger / smaller; j++) {
                triangles += 2 * j - 1;
            }

            sb.append(triangles).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
