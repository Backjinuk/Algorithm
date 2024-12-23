import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String[] strArray = sc.nextLine().split(" ");

        int x = Integer.parseInt(strArray[0]);
        int y = Integer.parseInt(strArray[1]);
        int v = Integer.parseInt(strArray[2]);

        long day = (long)((v - x + (x - y) - 1) / (x - y)) + 1;
        System.out.println(day);

    }
}