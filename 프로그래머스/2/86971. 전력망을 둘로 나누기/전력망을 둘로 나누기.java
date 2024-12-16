import java.util.ArrayList;

class Solution {
    public int solution(int n, int[][] wires) {
        Graph graph = new Graph(n);

        for (int[] wire : wires) {
            graph.addEdge(wire[0], wire[1]);
        }

        int minDiff = n;
        ArrayList<Integer>[] adjList = graph.getAdjList();

        for (int[] wire : wires) {
            boolean[] visited = new boolean[n + 1];

            int count1 = GraphTraversal.dfs(adjList, wire[0], visited, wire[1]);
            int count2 = n - count1;

            int diff = Math.abs(count1 - count2);
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}

class Graph {
    private int n;
    private ArrayList<Integer>[] adjList;

    public Graph(int n) {
        this.n = n;
        adjList = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v1, int v2) {
        adjList[v1].add(v2);
        adjList[v2].add(v1);
    }

    public ArrayList<Integer>[] getAdjList() {
        return adjList;
    }
}

class GraphTraversal {
    public static int dfs(ArrayList<Integer>[] adjList, int start, boolean[] visited, int exclude) {
        int count = 1;
        visited[start] = true;

        for (int next : adjList[start]) {
            if (!visited[next] && next != exclude) {
                count += dfs(adjList, next, visited, exclude);
            }
        }

        return count;
    }
}