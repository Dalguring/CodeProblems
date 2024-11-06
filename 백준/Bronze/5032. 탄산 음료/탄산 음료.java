import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int coke = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        getCoke(e + f, c);

        System.out.println(coke);
        br.close();
    }

    static void getCoke(int vacant, int needs) {
        if (vacant / needs == 0) {
            return;
        }

        coke += vacant / needs;
        getCoke(vacant / needs + vacant % needs, needs);
    }
}
