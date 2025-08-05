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
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        // structure
        int[][] babySharkMatrix = new int[row][column];
        Queue<int[]> queue = new LinkedList<>();
        int[][] distMatrix = new int[row][column];
        boolean[][] visitied = new boolean[row][column];

        // direction
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, 1, -1, -1, 0, 1};

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                babySharkMatrix[i][j] = Integer.parseInt(st.nextToken());

                if (babySharkMatrix[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visitied[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];

            for (int i = 0; i < 8; i++) {
                if (x + dx[i] >= 0 &&
                    y + dy[i] >= 0 &&
                    x + dx[i] < row &&
                    y + dy[i] < column &&
                    !visitied[x + dx[i]][y + dy[i]]
                ) {
                    queue.offer(new int[]{x + dx[i], y + dy[i]});
                    visitied[x + dx[i]][y + dy[i]] = true;
                    distMatrix[x + dx[i]][y + dy[i]] = distMatrix[x][y] + 1;
                }
            }
        }

        int max = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                max = Math.max(max, distMatrix[i][j]);
            }
        }

        System.out.print(max);
        br.close();
    }
}
