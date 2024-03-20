import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[length];
        Stack<Integer> stack = new Stack<>();
        int[] count = new int[10000001];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            count[array[i]]++;
        }

        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && count[array[stack.peek()]] < count[array[i]]) {
                array[stack.pop()] = array[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            array[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(' ');
        }

        System.out.println(sb);
    }
}