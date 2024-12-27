import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a1 = sc.nextLong();
        long a0 = sc.nextLong();
        long c = sc.nextLong();
        long N = sc.nextLong();

        if (c > a1) {
            if (a0 <= (c - a1) * N) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (c == a1) {
            if (a0 <= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}