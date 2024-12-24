import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    //소수는 1과 자기자신만으로 나누어 떨어지는수
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false; // 1이하는 소수가 아님
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false; // 짝수는 소수가 아님
        }

            int sqrt = (int)Math.sqrt(number); // 제곱근 구하기
            for (int i = 3; i <= sqrt; i += 2) { // 홀수만 검사
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
    }


    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int x = sc.nextInt();

        int count = 0;
        for (int i = 0; i < x; i++) {
            int number = sc.nextInt();

            if (isPrime(number)) {
               count++;
            }
        }

        System.out.println(count);


    }

}