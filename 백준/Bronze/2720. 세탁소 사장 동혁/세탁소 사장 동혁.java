import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        int quarter = 25;
        int dime    = 10;
        int nickel  = 5;
        int penny   = 1;

        for (int i = 0; i < count; i++) {
            int change = Integer.parseInt(sc.nextLine());

            StringBuilder sb = new StringBuilder();

            int quarters = change / quarter;
            change %= quarter;
            int dimes = change / dime;
            change %= dime;
            int nickels = change / nickel;
            change %= nickel;
            int pennies = change;

            sb.append(quarters).append(" ");
            sb.append(dimes).append(" ");
            sb.append(nickels).append(" ");
            sb.append(pennies);

            System.out.println(sb.toString());
        }
    }
}

