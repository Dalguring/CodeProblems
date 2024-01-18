import java.io.*;
import java.util.*;

public class Main {
    static Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = 0;

        while ((target = Integer.parseInt(br.readLine())) != -1) {
            set.add(1);
            addDivisor(target);
            boolean equal = set.stream().mapToInt(Integer::intValue).sum() == target;
            System.out.println(makeString(equal, target));
            set.clear();
        }
        br.close();
    }

    static void addDivisor(int target) {
        for (int i = 2; i <= Math.sqrt(target); i++) {
            if (target % i == 0) {
                set.add(i);
                set.add(target / i);
            }
        }
    }

    static String makeString(boolean equal, int target) {
        StringBuilder sb = new StringBuilder();

        if (equal) {
            sb.append(target + " = ");
            set.stream().forEach(elem -> sb.append(elem).append(" + "));
            sb.delete(sb.length() - 3, sb.length());
        } else {
            sb.append(target).append(" is NOT perfect.");
        }

        return sb.toString();
    }
}
