import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        list.add(x1);
        list.add(x2);
        list.add(y1);
        list.add(y2);
        list.add(Math.abs(x1 - x2));
        list.add(Math.abs(y1 - y2));
        Collections.sort(list);
        System.out.println(list.get(0));

    }
}
