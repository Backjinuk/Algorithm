import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result_x = 0;
        int result_y = 0;

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // xor 연산자로 유일값 체크
            result_x ^= x;
            result_y ^= y;
        }

        sc.close();
        
        System.out.println(result_x + " " + result_y);
    }

}