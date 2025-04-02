import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            Set<Integer> location = new HashSet<>();
            boolean isValid = true;

            for (int i = 0; i < 8; i++) {
                String row = br.readLine();

                if (row.indexOf("O") != row.lastIndexOf("O") || !row.contains("O")) {
                    isValid = false;
                    continue;
                }

                location.add(row.indexOf("O"));
            }

            sb.append(String.format("#%d %s\n", tc + 1, location.size() == 8 && isValid ? "yes" : "no"));
        }

        System.out.print(sb);
        br.close();
    }
}
