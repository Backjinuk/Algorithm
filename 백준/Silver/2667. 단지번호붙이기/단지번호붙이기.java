import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n;                    // 지도의 크기
    static int[][] map;              // 지도 배열 (0, 1)
    static boolean[][] visited;      // 방문 여부 체크 배열
    // 상하좌우 방향
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거
        
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str  = sc.nextLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    result.add(dfs(i, j));
                }
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (int size : result ) {
            System.out.println(size);
        }
    }

    private static int dfs(int x, int y) {
        visited[x][y] = true;

        int count = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];;
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    count += dfs(nx, ny);
                }
            }
        }

       return count;
    }
}
