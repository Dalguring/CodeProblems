import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int mapSize;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mapSize = Integer.parseInt(br.readLine());
        map = new int[mapSize][mapSize];
        visited = new boolean[mapSize][mapSize];
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < mapSize; i++) {
            char[] chars = br.readLine().toCharArray();

            for (int j = 0; j < mapSize; j++) {
                map[i][j] = Character.getNumericValue(chars[j]);
            }
        }

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    list.add(dfs(i, j));
                }
            }
        }

        sb.append(list.size()).append("\n");
        Collections.sort(list);
        list.forEach(e -> sb.append(e).append("\n"));

        System.out.print(sb);
        br.close();
    }

    static int dfs(int x, int y) {
        visited[x][y] = true;
        int count = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < mapSize && ny < mapSize) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    count += dfs(nx, ny);
                }
            }
        }

        return count;
    }
}