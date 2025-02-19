import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());
        Map<Character, Integer> baseMap = new HashMap<>();

        for (int i = 'A'; i <= 'Z'; i++) {
            baseMap.put((char) i, i - 'A');
        }

        for (int i = 'a'; i <= 'z'; i++) {
            baseMap.put((char) i, i - 'a' + baseMap.get('Z') + 1);
        }

        for (int i = 0; i <= 9; i++) {
            baseMap.put((char) ('0' + i), baseMap.get('z') + i + 1);
        }

        baseMap.put('+', baseMap.get('9') + 1);
        baseMap.put('/', baseMap.get('+') + 1);

        for (int tc = 0; tc < testcase; tc++) {
            char[] buffer = br.readLine().toCharArray();
            StringBuilder accumulate = new StringBuilder();
            sb.append(String.format("#%d ", tc + 1));

            for (char c : buffer) {
                accumulate.append(getAs6Bit(baseMap.get(c)));
            }

            for (int i = 0; i < accumulate.length(); i += 8) {
                sb.append((char) Integer.parseInt(accumulate.substring(i, i + 8), 2));
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static String getAs6Bit(int number) {
        return String.format("%6s", Integer.toBinaryString(number)).replaceAll(" ", "0");
    }
}