import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int column = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[row][column];
        int[][] tomatoMatrix = new int[row][column];
        int[][] days = new int[row][column];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                int status = Integer.parseInt(st.nextToken());
                tomatoMatrix[i][j] = status;

                if (status == 1) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
                if (status == -1) {
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];

            for (int i = 0; i < 4; i++) {
                if (x + dx[i] >= 0
                        && y + dy[i] >= 0
                        && x + dx[i] < row
                        && y + dy[i] < column
                        && !visited[x + dx[i]][y + dy[i]]
                ) {
                    queue.offer(new int[]{x + dx[i], y + dy[i]});
                    visited[x + dx[i]][y + dy[i]] = true;
                    days[x + dx[i]][y + dy[i]] = days[x][y] + 1;
                }
            }
        }

        int max = 0;

        OUTER:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (tomatoMatrix[i][j] == 0 && days[i][j] == 0) {
                    max = -1;
                    break OUTER;
                }
                max = Math.max(days[i][j], max);
            }
        }

        System.out.print(max);
        br.close();
    }
}
