import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            map.put(Integer.parseInt(st.nextToken()), 1);
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < B; i++) {
            int target = Integer.parseInt(st.nextToken());

            if (map.containsKey(target))
                map.remove(target);
            else
                map.put(target, 1);
        }
        
        br.close();
        System.out.println(map.keySet().size());
    }
}
