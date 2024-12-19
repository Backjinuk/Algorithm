import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = 0;
        int position = 0;

        while(x > 0){
           n++;
           x -= n;
        }

        position = x + n;

        int molecule , denominator;

        if(n % 2 == 0){
            molecule = position;
            denominator = n - position + 1;
        }else {
            molecule = n - position +1;
            denominator = position;
        }

       String result = molecule + "/" + denominator;

        System.out.println(result);
    }
}