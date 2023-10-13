import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int words = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words; i++) {
            String word = br.readLine();
            if (word.length() < limit)
                continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (!map.get(o2).equals(map.get(o1)))
                    return map.get(o2) - map.get(o1);
                else if (o2.length() != o1.length())
                    return o2.length() - o1.length();
                else
                    return o1.compareTo(o2);
            }
        });

        for (String s : list)
            bw.write(s + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}