import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numbers = Integer.parseInt(br.readLine());
        int[] inputNums = new int[3];
        int lastNumber = 0;

        for (int i = 0; i < numbers; i++) {
            int num = Integer.parseInt(br.readLine());

            if (i < 3) {
                inputNums[i] = num;
            }
            if (i == numbers - 1) {
                lastNumber = num;
            }
        }

        if ((double) inputNums[1] / inputNums[0] == (double) inputNums[2] / inputNums[1]) {
            System.out.println(lastNumber * (inputNums[1] / inputNums[0]));
        } else {
            System.out.println(lastNumber + (inputNums[1] - inputNums[0]));
        }

        br.close();
    }
}
