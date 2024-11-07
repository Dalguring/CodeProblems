import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> numberQ = new LinkedList<>();
        Queue<Character> characterQ = new LinkedList<>();
        String input;
        int index = 0;

        while (!(input = br.readLine()).equals("=")) {
            if (index % 2 == 0) {
                numberQ.offer(Integer.parseInt(input));
            } else {
                characterQ.offer(input.charAt(0));
            }

            index++;
        }

        int start = numberQ.poll();

        while (!numberQ.isEmpty() && !characterQ.isEmpty()) {
            switch (characterQ.poll()) {
                case '+':
                    start += numberQ.poll();
                    break;
                case '-':
                    start -= numberQ.poll();
                    break;
                case '*':
                    start *= numberQ.poll();
                    break;
                case '/':
                    start /= numberQ.poll();
                    break;
            }
        }

        System.out.println(start);
        br.close();
    }
}
