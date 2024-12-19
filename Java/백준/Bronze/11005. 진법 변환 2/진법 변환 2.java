import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] values = sc.nextLine().split(" ");

        int number = Integer.parseInt(values[0]);
        int base = Integer.parseInt(values[1]);

        StringBuilder result = new StringBuilder();
        while (number > 0 ){
            int wordNumber = number % base;

            result.insert(0, (char) (wordNumber < 10 ? wordNumber + '0' : wordNumber - 10 + 'A'));


            number /= base;

        }

        System.out.println(result.toString());
    }
}
