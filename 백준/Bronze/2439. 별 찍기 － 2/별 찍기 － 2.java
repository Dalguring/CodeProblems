import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int layer = Integer.parseInt(br.readLine());

        dfs(1, layer);
        System.out.print(sb);
        br.close();
    }

    static void dfs(int depth, int layer) {
        if (depth > layer) {
            return;
        }

        sb.append(" ".repeat(layer - depth)).append("*".repeat(depth)).append("\n");
        dfs(depth + 1, layer);
    }
}
