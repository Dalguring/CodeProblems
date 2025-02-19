import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static final int SAME = 0;
    static final int ACCELERATE = 1;
    static final int DECELERATE = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int speed = 0;
            int distance = 0;
            int second = Integer.parseInt(br.readLine());

            for (int i = 0; i < second; i++) {
                st = new StringTokenizer(br.readLine());
                int delim = Integer.parseInt(st.nextToken());
                int delta = 0;

                if (delim != 0) {
                    delta = Integer.parseInt(st.nextToken());
                }

                switch (delim) {
                    case SAME:
                        distance += speed;
                        break;
                    case ACCELERATE:
                        speed += delta;
                        distance += speed;
                        break;
                    case DECELERATE:
                        if (speed <= delta) {
                            speed = 0;
                        } else {
                            speed -= delta;
                            distance += speed;
                        }
                        break;
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, distance));
        }

        System.out.println(sb);
        br.close();
    }
}