import java.util.Scanner;

public class Main {
    static String[][] board = new String[19][19];
    static int[] dx = {0, 1, 1, -1}; // →, ↓, ↘, ↙
    static int[] dy = {1, 0, 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 19; i++) {
            board[i] = sc.nextLine().split(" ");
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (!board[i][j].equals("0")) {
                    if (checkWin(i, j, board[i][j])) {
                        System.out.println(board[i][j]);
                        System.out.println((i + 1) + " " + (j + 1));
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }

    private static boolean checkWin(int x, int y, String color) {
        for (int d = 0; d < 4; d++) {
            int count = 1;
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 한 방향으로 탐색
            while (isValid(nx, ny) && board[nx][ny].equals(color)) {
                count++;
                if (count > 5) break; // 6목 체크
                nx += dx[d];
                ny += dy[d];
            }

            // 6목 체크: 앞에 같은 돌이 있는지 확인 (반대 방향)
            int px = x - dx[d];
            int py = y - dy[d];
            if (isValid(px, py) && board[px][py].equals(color)) {
                continue; // 6목이면 무효
            }

            // 정확히 5개면 승리
            if (count == 5) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < 19 && y >= 0 && y < 19;
    }
}
