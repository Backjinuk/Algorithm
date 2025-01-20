import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt();
        int v = sc.nextInt();

        // 그래프 저장 (인접 리스트)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a); // 양방향
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS 실행
        boolean[] visited = new boolean[n + 1];
        dfs(v, graph, visited);
        System.out.println();

        // BFS 실행
        bfs(v, graph);
    }

    public static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true; // 현재 노드 방문 표시
        System.out.print(node + " "); // 방문한 노드 출력

        for (int neighbor : graph.get(node)) { // 연결된 노드 탐색
            if (!visited[neighbor]) { // 방문하지 않은 노드만
                dfs(neighbor, graph, visited); // 재귀 호출
            }
        }
    }

    public static void bfs(int start, List<List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
