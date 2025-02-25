import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int snailSize = Integer.parseInt(br.readLine());
            int[][] snailMatrix = new int[snailSize][snailSize];

            int x = 0;
            int y = 0;
            int dir = 0;
            int num = 1;

            for (int i = 0; i < snailSize * snailSize; i++) {
                snailMatrix[x][y] = num++;
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= snailSize || ny >= snailSize || snailMatrix[nx][ny] != 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                x = nx;
                y = ny;
            }

            sb.append("#").append(tc + 1).append("\n");

            for (int[] matrix : snailMatrix) {
                for (int i : matrix) {
                    sb.append(i).append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}