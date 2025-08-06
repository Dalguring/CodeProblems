import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int column = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int[][] tomatoMatrix = new int[row * height][column];
        int[][] days = new int[row * height][column];

        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {0, 0, -1, 1, 0, 0};
        int[] dy = {-1, 1, 0, 0, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};

        for (int i = 0; i < row * height; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < column; j++) {
                tomatoMatrix[i][j] = Integer.parseInt(st.nextToken());

                if (tomatoMatrix[i][j] == 1) {
                    queue.offer(new int[]{i % row, j, i / row});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];
            int z = point[2];

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];

                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < row && ny < column && nz < height && tomatoMatrix[nx + (nz * row)][ny] == 0) {
                    queue.offer(new int[]{nx, ny, nz});
                    tomatoMatrix[nx + (nz * row)][ny] = 1;
                    days[nx + (nz * row)][ny] = days[x + (z * row)][y] + 1;
                }
            }
        }

        int max = 0;

        for (int i = 0; i < row * height; i++) {
            for (int j = 0; j < column; j++) {
                if (tomatoMatrix[i][j] == 0) {
                    System.out.print(-1);
                    return;
                }

                max = Math.max(max, days[i][j]);
            }
        }

        System.out.print(max);
        br.close();
    }
}
