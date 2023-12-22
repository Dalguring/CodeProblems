import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int target = Integer.parseInt(st.nextToken());
            int square = Integer.parseInt(st.nextToken());
            if (target % 10 == 0) {
                sb.append("10\n");
                continue;
            }
            sb.append(getRemainder(target, square)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static int getRemainder(int target, int square) {
        List<Integer> list = new ArrayList<>();
        list.add(target % 10);
        int remainder = target % 10;
        for (int i = 0; i < square; i++) {
            remainder = remainder * target % 10;
            if (list.contains(remainder))
                break;
            else
                list.add(remainder);
        }

        return list.get((square - 1) % list.size());
    }
}
