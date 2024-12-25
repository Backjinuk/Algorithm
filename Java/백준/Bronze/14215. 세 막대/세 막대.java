import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] sortValue = {x, y, z};
        Arrays.sort(sortValue);

        int a = sortValue[0];
        int b = sortValue[1];
        int c = sortValue[2];

       int result = 0;
       if(a + b <= c) {
           result = a + b + ((a + b) - 1);
       }else{
           result = a + b + c;
       }
        sc.close();
        
        System.out.println(result);
    }
}