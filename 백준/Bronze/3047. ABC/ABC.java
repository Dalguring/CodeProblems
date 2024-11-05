import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(numbers);
        String input = br.readLine();

        for (char c : input.toCharArray()) {
            sb.append(numbers.get(c - 'A')).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
