import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        String target = br.readLine().toUpperCase();
        br.close();

        for (char c : target.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Character> keySet = new ArrayList<>(map.keySet());

        keySet.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2) - map.get(o1);
            }
        });

        char answer;

        if (map.size() > 1)
            answer = map.get(keySet.get(0)).equals(map.get(keySet.get(1))) ? '?' : keySet.get(0);
        else answer = keySet.get(0);

        System.out.println(answer);
    }
}