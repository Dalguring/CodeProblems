import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int num = 1;
        while(list.size() != K) {
            if (num > N) break;
            if (N % num == 0) list.add(num);
            num++;
        }
        if(list.size() == K) {
            System.out.println(list.get(K - 1));
        } else {
            System.out.println(0);
        }
    }
}
