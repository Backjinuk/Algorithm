import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] array = {
                {"2", "3", "4", "5", "6", "7", "8", "9"},
                {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"}
        };

        int sum = 0;
        String[] str = scanner.next().toUpperCase().split("");

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[1][j].contains(str[i])) {
                    sum +=  Integer.parseInt(array[0][j]) + 1;
                }

            }
        }

        System.out.println(sum);
        scanner.close();

    }
}