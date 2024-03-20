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
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            countMap.put(array[i], countMap.getOrDefault(array[i], 0) + 1);
        }

        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && countMap.get(array[stack.peek()]) < countMap.get(array[i])) {
                array[stack.pop()] = array[i];
            }

            stack.push(i);
        }

        for (int index : stack) {
            array[index] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(' ');
        }

        System.out.println(sb);
    }
}