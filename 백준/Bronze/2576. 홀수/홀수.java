import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number % 2 != 0) {
                list.add(number);
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
            return;
        }

        int sum = list.stream().mapToInt(Integer::intValue)
                        .sum();
        int min = list.stream().mapToInt(Integer::intValue)
                        .min().getAsInt();

        System.out.println(sum);
        System.out.println(min);

        br.close();
    }
}
