import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Character, Integer> binaryMap = new HashMap<>();

        for (int i = 10; i <= 35; i++) {
            binaryMap.put((char)('A' - 10 + i), i);
        }

        StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
        int rootNum = Integer.parseInt(st.nextToken());
        int total = 0;

        for (int i = 0; i < sb.length(); i++) {
            char target = sb.charAt(i);
            if (binaryMap.containsKey(target)) {
                total += binaryMap.get(target) * Math.pow(rootNum, i);
            } else {
                total += Character.getNumericValue(target) * Math.pow(rootNum, i);
            }
        }

        System.out.println(total);
        br.close();
    }
}
