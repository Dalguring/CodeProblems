import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int denominator = 1;
        int numerator = 1;
        int count = 1;
        int nextGroup = 2;
        int nextEnd = 1;

        while (count <= input) {
            if (count == input) {
                System.out.printf("%d/%d%n", denominator, numerator);
                return;
            }

            if (count == nextEnd) {
                nextEnd += nextGroup;

                if (nextGroup % 2 == 0) {
                    numerator++;
                } else {
                    denominator++;
                }

                nextGroup++;
                count++;
                continue;
            }

            if (nextGroup % 2 == 0) {
                denominator--;
                numerator++;
            } else {
                numerator--;
                denominator++;
            }

            count++;
        }
    }
}
