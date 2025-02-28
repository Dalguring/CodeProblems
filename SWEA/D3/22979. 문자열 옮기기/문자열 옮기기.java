import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            String[] chars = br.readLine().split("");
            Deque<String> deque = new LinkedList<>(Arrays.asList(chars));
            br.readLine();
            st = new StringTokenizer(br.readLine());
            int sum = 0;

            while (st.hasMoreTokens()) {
                int repetition = Integer.parseInt(st.nextToken());
                if (repetition == 0) {
                    continue;
                }

                repetition %= chars.length;
                if (Math.abs(repetition) > chars.length / 2) {
                    repetition = repetition < 0 ? (repetition + chars.length) : -(chars.length - repetition);
                }

                sum += repetition;
            }

            changeDeque(deque, sum);
            deque.forEach(sb::append);
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static void changeDeque(Deque<String> deque, int repetition) {
        boolean isPositive = repetition > 0;

        if (isPositive) {
            for (int i = 0; i < repetition; i++) {
                deque.addLast(deque.pollFirst());
            }
        } else {
            for (int i = 0; i < -repetition; i++) {
                deque.addFirst(deque.pollLast());
            }
        }
    }
}