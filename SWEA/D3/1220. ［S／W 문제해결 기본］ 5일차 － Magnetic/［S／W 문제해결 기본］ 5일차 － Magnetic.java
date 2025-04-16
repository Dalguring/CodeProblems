import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    private static int SIZE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
//        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < 10; tc++) {
            SIZE = Integer.parseInt(br.readLine());
            int[][] table = new int[SIZE][SIZE];
            int agglutination = 0;

            for (int i = 0; i < SIZE; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < SIZE; j++) {
                    table[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 세로 탐색
            for (int i = 0; i < SIZE; i++) {
                int index = -1;
                int count = 0;
                boolean isSolid = true;

                for (int j = 0; j < SIZE; j++) {
                    if (table[j][i] != 0) {
                        count++;
                        index = j;
                    }
                    if (count > 1) {
                        isSolid = false;
                        break;
                    }
                }

                if (isSolid) {
                    table[index][i] = 0;
                } else {
                    int sequence = 0;
                    // 정방향 탐색
                    while (table[sequence][i] != 1) {
                        table[sequence][i] = 0;
                        sequence++;
                    }
                    // 역방향 탐색
                    sequence = SIZE - 1;
                    while (table[sequence][i] != 2) {
                        table[sequence][i] = 0;
                        sequence--;
                    }

                    int lastColor = 1;

                    for (int j = 0; j < SIZE; j++) {
                        if (table[j][i] == 2 && lastColor != 2) {
                            lastColor = table[j][i];
                            agglutination++;
                        }
                        if (table[j][i] == 1) {
                            lastColor = 1;
                        }
                    }
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, agglutination));
        }

        System.out.print(sb);
        br.close();
    }
}
