import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int tc = 0; tc < testcase; tc++) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int sequence = Integer.parseInt(st.nextToken());
            int[][] wordPuzzle = new int[size][size];
            int result = 0;

            for (int i = 0; i < size; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < size; j++) {
                    wordPuzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 가로 탐색
            for (int i = 0; i < size; i++) {
                int count = 0;

                for (int j = 0; j < size; j++) {
                    if (wordPuzzle[i][j] == 1) {
                        count++;
                    } else {
                        if (count == sequence) {
                            result++;
                        }
                        count = 0;
                    }
                }

                if (count == sequence) {
                    result++;
                }
            }

            // 세로 탐색
            for (int i = 0; i < size; i++) {
                int count = 0;

                for (int j = 0; j < size; j++) {
                    if (wordPuzzle[j][i] == 1) {
                        count++;
                    } else {
                        if (count == sequence) {
                            result++;
                        }
                        count = 0;
                    }
                }

                if (count == sequence) {
                    result++;
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, result));
        }

        System.out.println(sb);
        br.close();
    }
}