import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalCase; i++) {
            st = new StringTokenizer(br.readLine());
            List<Integer> scoreList = new ArrayList<>();
            int count = Integer.parseInt(st.nextToken());

            while (st.hasMoreTokens()) {
                scoreList.add(Integer.parseInt(st.nextToken()));
            }

            double average = scoreList.stream()
                                        .mapToInt(Integer::intValue)
                                        .average()
                                        .orElse(0);

            long value = scoreList.stream()
                                    .filter(score -> score > average)
                                    .count();

            double percentage = (double) value / count * 100;
            sb.append(String.format("%.3f%%", percentage)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
