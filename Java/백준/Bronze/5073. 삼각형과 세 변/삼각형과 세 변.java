import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if(x == 0 && y ==0 && z == 0){
                break;
            }
            var answer = getString(x, y, z);

            System.out.println(answer);

        }
    }

    private static String getString(int x, int y, int z) {
        int[] sortValue = {x, y, z};
        Arrays.sort(sortValue);

        int a = sortValue[0];
        int b = sortValue[1];
        int c = sortValue[2];

        if((a + b) <= c){
            return "Invalid";
        }

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c) {
            return "Isosceles";
        } else {
            return"Scalene";
        }
    }
}