package 이차원배열;

import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {
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

}
