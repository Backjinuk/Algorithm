import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[][] board = new String[N][M];
        for (int i = 0; i < N; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < M; j++) {
               board[i][j] = String.valueOf(row.charAt(j));
            }
        }

        int maxSide = Math.min(N, M);

        for (int l = maxSide; l >= 1; l--) {
            for (int i = 0; i <= N - l; i++) {
                for (int j = 0; j <= M - l; j++) {

                    String topLeft = board[i][j];
                    String topRight = board[i][j + l - 1];
                    String bottomLeft = board[i + l - 1][j];
                    String bottomRight = board[i + l - 1][j + l - 1];

                    if (topLeft.equals(topRight) && topLeft.equals(bottomLeft) && topLeft.equals(bottomRight)) {
                        System.out.println(l * l);
                        return;
                    }
                }
            }
        }
    }
}
