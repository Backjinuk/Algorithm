import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int starSize = sc.nextInt();
        StringBuilder star = new StringBuilder();

        for (int i = 0; i < starSize; i++) {
            for (int j = 0; j < starSize - i - 1; j++)
                star.append(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                star.append("*");
            star.append("\n");
        }

        for (int i = starSize - 2; i >= 0; i--) {
            for (int j = 0; j < starSize - i - 1; j++)
                star.append(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                star.append("*");
            star.append("\n");
        }

        System.out.println(star.toString());
        sc.close();
    }
}
