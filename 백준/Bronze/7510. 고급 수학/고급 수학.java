import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Integer> triangles;

        for (int i = 0; i < t; i++) {
            sb.append(String.format("Scenario #%d:\n", i + 1));
            st = new StringTokenizer(br.readLine());
            triangles = new ArrayList<>();

            while (st.hasMoreTokens()) {
                triangles.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(triangles);
            int min = triangles.get(0);
            int middle = triangles.get(1);
            int max = triangles.get(2);

            if (max >= min + middle || Math.pow(min, 2) + Math.pow(middle, 2) != Math.pow(max, 2)) {
                sb.append("no\n\n");
            } else {
                sb.append("yes\n\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
