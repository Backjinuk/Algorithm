import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min_x = Integer.MAX_VALUE;
        int max_x = Integer.MIN_VALUE;

        int min_y = Integer.MAX_VALUE;
        int max_y = Integer.MIN_VALUE;

        if(n == 1){
            System.out.println(0);
            sc.close();
            return;
        }

        for (int i = 0; i < n ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            min_x = Math.min(min_x, x);
            max_x = Math.max(max_x , x);

            min_y = Math.min(min_y, y);
            max_y = Math.max(max_y, y);
        }


        sc.close();

        int result = (max_x - min_x) * (max_y - min_y);

        System.out.println(result);
    }
}