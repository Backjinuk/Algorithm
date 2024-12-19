import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = 2;
        int move = sc.nextInt();

        for (int i = 0; i < move; i++) {
            base = (base-1) + base;
        }

        System.out.println((int) Math.pow(base, 2));
    }
}


