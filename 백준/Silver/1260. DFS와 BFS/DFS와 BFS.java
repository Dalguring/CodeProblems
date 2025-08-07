import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new ArrayList[node + 1];

        for (int i = 1; i <= node; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        for (int i = 1; i <= node; i++) {
            Collections.sort(graph[i]);
        }

        boolean[] visited = new boolean[node + 1];
        dfs(start, visited);

        sb.append("\n");

        visited = new boolean[node + 1];
        bfs(start, visited);

        System.out.print(sb);
        br.close();
    }

    static void dfs(int start, boolean[] visited) {
        sb.append(start).append(" ");
        visited[start] = true;

        for (int i = 0; i < graph[start].size(); i++) {
            int related = graph[start].get(i);

            if (visited[related]) {
                continue;
            }
            dfs(related, visited);
        }
    }

    static void bfs(int start, boolean[] visited) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");

            for (int next : graph[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}