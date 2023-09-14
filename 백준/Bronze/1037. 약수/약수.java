import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));

        br.close();
        Collections.sort(list);
        Deque<Integer> deque = new ArrayDeque<>(list);
        int size = deque.size();
        int answer = 0;

        for (int i = 0; i < size / 2; i++) {
            answer = deque.pollFirst() * deque.pollLast();
        }
        if (deque.isEmpty())
            System.out.println(answer);
        else System.out.println((int)Math.pow((double) deque.poll(), 2));

    }
}