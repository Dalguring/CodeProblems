import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C, K;
    static char[][] map;
    static boolean[][] visited;
    static int count = 0;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        visited[R - 1][0] = true;
        dfs(R - 1, 0, 1);
        System.out.println(count);
    }

    static void dfs(int x, int y, int depth) {
        if (x == 0 && y == C - 1) {
            if (depth == K) {
                count++;
            }
            return;
        }

        if (depth >= K) return;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
            if (visited[nx][ny] || map[nx][ny] == 'T') continue;

            visited[nx][ny] = true;
            dfs(nx, ny, depth + 1);
            visited[nx][ny] = false;
        }
    }
}
