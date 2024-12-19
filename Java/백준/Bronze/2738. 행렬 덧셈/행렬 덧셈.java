import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] intArrayA = arrayInput(N, M, sc);
        int[][] intArrayB = arrayInput(N, M, sc);
        int[][] intArrayC = sumArray(intArrayA, intArrayB, N, M);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(intArrayC[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }

    public static int[][] arrayInput(int N, int M, Scanner sc){

        int[][] intArray = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                intArray[i][j] = sc.nextInt();
            }
        }

        return intArray;
    }

    public static int[][] sumArray(int[][] intArrayA , int[][] intArrayB, int N, int M){
        int[][] intArrayC = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                intArrayC[i][j]  = intArrayA[i][j] + intArrayB[i][j];
            }
        }

        return intArrayC;
    }
}
