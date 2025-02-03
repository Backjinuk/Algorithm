import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        String[][] arr = new String[M][N];

        for (int i = 0; i < M; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                arr[i][j] = String.valueOf(line.charAt(j));
            }
        }

        int count = Integer.MAX_VALUE;

        // 8 * 8 크기로 자르기
        for (int i = 0; i <= M - 8; i++) {
            for (int j = 0; j <= N - 8; j++) {

               int result =  bruteForce(arr, i, j);
               count = Math.min(count, result);

            }
        }
        
        System.out.println(count);
    }

    private static int bruteForce(String[][] arr, int start, int end) {
        int countCase1 = 0;
        int countCase2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String color = arr[start + i][end + j];

                if ((i + j) % 2 == 0) {
                    if (!color.equals("W")) {
                        countCase1++;
                    } else {
                        countCase2++;
                    }

                } else {
                    if (!color.equals("B")) {
                        countCase1++;
                    } else {
                        countCase2++;
                    }
                }


            }
        }

        return Math.min(countCase1, countCase2);
    }
}
