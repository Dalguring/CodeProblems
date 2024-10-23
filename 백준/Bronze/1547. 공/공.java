import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int cup = 1;

        for (int i = 0; i < M; i++) {
            String switched = br.readLine();

            if (switched.contains(String.valueOf(cup))) {
                String[] cups = switched.split(" ");
                cup = Integer.parseInt(cups[0]) == cup ? Integer.parseInt(cups[1]) : Integer.parseInt(cups[0]);
            }
        }

        System.out.println(cup);

        br.close();
    }
}
