import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer> cardList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        int answer = 0;

        while (st.hasMoreTokens())
            cardList.add(Integer.parseInt(st.nextToken()));

        br.close();

        OUTER:
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int number = cardList.get(i) + cardList.get(j) + cardList.get(k);
                    if (number == M) {
                        answer = M;
                        break OUTER;
                    }
                    if (number < M) {
                        answer = Math.max(answer, number);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}