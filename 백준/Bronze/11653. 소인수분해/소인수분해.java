import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        primeFactor(N);
    }

    public static void primeFactor(int N){
        while( N % 2 ==0){ // 2로 최대한 나누기
            System.out.println(2);
            N /= 2;
        }

        int sqrt = (int) Math.sqrt(N);
        for (int i = 3; i <= sqrt; i+=2) { // 홀수 로 나누기
            while( N % i == 0){
                System.out.println(i);
                N /= i;
            }
        }

        if(N > 2){ // 그외 소수 출력
            System.out.println(N);
        }
    }
}