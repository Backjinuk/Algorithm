import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] values = sc.nextLine().split(" ");

        String number = values[0];
        int base = Integer.parseInt(values[1]);

        int sum = 0;

        for (char c : number.toCharArray()){
            int digit = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
            sum = sum * base + digit;
        }

        System.out.println(sum);
    }


}
