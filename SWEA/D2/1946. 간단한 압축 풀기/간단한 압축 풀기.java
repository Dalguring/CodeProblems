import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            List<Character> alphabetList = new ArrayList<>();
            sb.append(String.format("#%d\n", tc + 1));
            int alphabets = Integer.parseInt(br.readLine());

            for (int i = 0; i < alphabets; i++) {
                st = new StringTokenizer(br.readLine());
                char alphabet = st.nextToken().charAt(0);
                int count = Integer.parseInt(st.nextToken());

                for (int j = 0; j < count; j++) {
                    alphabetList.add(alphabet);
                }
            }

            for (int i = 0; i < alphabetList.size(); i++) {
                if (i % 10 == 0 && i != 0) {
                    sb.append("\n");
                }
                sb.append(alphabetList.get(i ));
            }

            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}