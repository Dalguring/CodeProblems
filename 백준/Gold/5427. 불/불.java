import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int column = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            String[][] building = new String[row][column];
            int[][] dist = new int[row][column];
            Queue<int[]> fireQueue = new LinkedList<>();
            Queue<int[]> sangeunQueue = new LinkedList<>();
            boolean escaped = false;

            for (int j = 0; j < row; j++) {
                String[] delim = br.readLine().split("");

                for (int k = 0; k < column; k++) {
                    building[j][k] = delim[k];

                    if (building[j][k].equals("*")) {
                        fireQueue.offer(new int[]{j, k});
                    } else if (building[j][k].equals("@")) {
                        sangeunQueue.offer(new int[]{j, k});
                        dist[j][k] = 1;
                    }
                }
            }

            while (!sangeunQueue.isEmpty()) {
                // 턴제 방식
                // fire 먼저
                int fireSize = fireQueue.size();

                for (int j = 0; j < fireSize; j++) {
                    int[] point = fireQueue.poll();
                    int x = point[0];
                    int y = point[1];

                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if (nx >= 0 && ny >= 0 && nx < row && ny < column && (building[nx][ny].equals(".") || building[nx][ny].equals("@"))) {
                            building[nx][ny] = "*";
                            fireQueue.offer(new int[]{nx, ny});
                        }
                    }
                }

                int sangeunSize = sangeunQueue.size();

                for (int j = 0; j < sangeunSize; j++) {
                    int[] point = sangeunQueue.poll();
                    int x = point[0];
                    int y = point[1];

                    if (x == 0 || x == row - 1 || y == 0 || y == column - 1) {
                        sb.append(dist[x][y]).append("\n");
                        escaped = true;
                        break;
                    }

                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if (nx >= 0 && ny >= 0 && nx < row && ny < column && building[nx][ny].equals(".") && dist[nx][ny] == 0) {
                            sangeunQueue.offer(new int[]{nx, ny});
                            dist[nx][ny] = dist[x][y] + 1;
                        }
                    }
                }

                if (escaped) break;
            }

            if (!escaped) {
                sb.append("IMPOSSIBLE\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}
