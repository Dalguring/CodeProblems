import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        // Bubble Sort
        for (int i = 1; i < count; i++) {
            for (int j = 0; j < count - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            sb.append(numbers[i]).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}
