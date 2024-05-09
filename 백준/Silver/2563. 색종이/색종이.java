import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] booleanArray = new boolean[100][100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                booleanArray[i][j] = true; 
            }
        }

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            processBlackPaper(booleanArray, x, y);
        }

        System.out.println(processWhitePaper(booleanArray));

    }

    private static void processBlackPaper(boolean[][] booleanArray, int x, int y) {
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                booleanArray[i][j] = false;
            }
        }
    }

    private static int processWhitePaper(boolean[][] booleanArray) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (!booleanArray[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
