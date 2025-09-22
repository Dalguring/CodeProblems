import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commands = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < commands; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                deque.pollLast();
            } else {
                deque.addLast(number);
            }
        }

        System.out.print(deque.stream().mapToInt(Integer::intValue).sum());
        br.close();
    }
}