import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] intArray = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                intArray[i][j] = sc.nextInt();
            }
        }

        int[] maxPos = findMaxPosition(intArray);
        
        System.out.println(intArray[maxPos[0]][maxPos[1]]);
        System.out.println((maxPos[0] + 1) + " " + (maxPos[1] + 1));
    }

    public static int[] findMaxPosition(int[][] array) {
        int max = array[0][0];
        int[] maxPos = {0, 0};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxPos[0] = i;
                    maxPos[1] = j;
                }
            }
        }

        return maxPos;
    }
}
