import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < N; i++)
            map.put(br.readLine(), 0);

        int person = 0;

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if(map.containsKey(name)) {
                map.put(name, map.getOrDefault(name, 0) + 1);
                person += 1;
            }
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        sb.append(person + "\n");

        for(Map.Entry<String, Integer> el : map.entrySet()) {
            if(el.getValue() == 1) sb.append(el.getKey() + "\n");
        }

        System.out.println(sb);

    }
}

