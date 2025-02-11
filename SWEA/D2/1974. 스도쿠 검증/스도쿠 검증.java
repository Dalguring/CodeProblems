import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static final int ERROR = 0;
    static final int CORRECT = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        OUTER:
        for (int tc = 0; tc < testcase; tc++) {
            int[][] sudoku = new int[9][9];
            int[] used;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 가로 탐색
            for (int i = 0; i < 9; i++) {
                used = new int[9];

                for (int j = 0; j < 9; j++) {
                    if (used[sudoku[i][j] - 1] == 0) {
                        used[sudoku[i][j] - 1]++;
                    } else {
                        sb.append(String.format("#%d %d\n", tc + 1, ERROR));
                        continue OUTER;
                    }
                }
            }

            // 세로 탐색
            for (int i = 0; i < 9; i++) {
                used = new int[9];

                for (int j = 0; j < 9; j++) {
                    if (used[sudoku[j][i] - 1] == 0) {
                        used[sudoku[j][i] - 1]++;
                    } else {
                        sb.append(String.format("#%d %d\n", tc + 1, ERROR));
                        continue OUTER;
                    }
                }
            }

            // 범위 탐색
            for (int i = 0; i < 9; i += 3) {
                used = new int[9];

                for (int j = i; j < i + 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (used[sudoku[j][k] - 1] == 0) {
                            used[sudoku[j][k] - 1]++;
                        } else {
                            sb.append(String.format("#%d %d\n", tc + 1, ERROR));
                            continue OUTER;
                        }
                    }
                }

                used = new int[9];
                for (int j = i; j < i + 3; j++) {
                    for (int k = 3; k < 6; k++) {
                        if (used[sudoku[j][k] - 1] == 0) {
                            used[sudoku[j][k] - 1]++;
                        } else {
                            sb.append(String.format("#%d %d\n", tc + 1, ERROR));
                            continue OUTER;
                        }
                    }
                }

                used = new int[9];
                for (int j = i; j < i + 3; j++) {
                    for (int k = 6; k < 9; k++) {
                        if (used[sudoku[j][k] - 1] == 0) {
                            used[sudoku[j][k] - 1]++;
                        } else {
                            sb.append(String.format("#%d %d\n", tc + 1, ERROR));
                            continue OUTER;
                        }
                    }
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, CORRECT));
        }

        System.out.println(sb);
        br.close();
    }
}