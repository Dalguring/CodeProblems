import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int computer = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        graph = new ArrayList[computer + 1];
        boolean[] visited = new boolean[computer + 1];

        for (int i = 1; i <= computer; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        dfs(1, visited);

        System.out.print(count - 1);
        br.close();
    }

    static void dfs(int start, boolean[] visited) {
        count++;
        visited[start] = true;

        for (int i = 0; i < graph[start].size(); i++) {
            int related = graph[start].get(i);

            if (!visited[related]) {
                dfs(related, visited);
            }
        }
    }
}