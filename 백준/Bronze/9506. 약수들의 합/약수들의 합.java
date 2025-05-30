import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals("-1")) {
            int target = Integer.parseInt(input);
            sb.append(target);
            List<Integer> list = getDivisorSum(target);
            Collections.sort(list);
            
            int sum = list.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            if (target == sum) {
                sb.append(" = ");

                for (int i : list) {
                    sb.append(i).append(" + ");
                }
                sb.delete(sb.length() - 3, sb.length());
                sb.append("\n");
            } else {
                sb.append(" is NOT perfect.\n");
            }
        }

        System.out.print(sb);
    }

    static List<Integer> getDivisorSum(int number) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                list.add(i);

                if (number / i != i) {
                    list.add(number / i);
                }
            }
        }

        return list;
    }
}
