import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int index = 1;
        boolean isTrue = true;
        int count = 0;

        while (isTrue) {
            int standard = (int) Math.pow(10, index) - 1;

            if (number >= standard) {
                count += index * (standard - (standard + 1) / 10 + 1);
                index++;
            } else {
                count += index * (number - (standard + 1) / 10 + 1);
                isTrue = false;
            }
        }

        System.out.println(count);
        br.close();
    }
}