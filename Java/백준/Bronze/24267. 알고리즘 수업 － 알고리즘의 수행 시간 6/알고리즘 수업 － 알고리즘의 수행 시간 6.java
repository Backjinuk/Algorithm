import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = 3;

        long nFacto = (n - 1) * (n -2) * n;
        long mFacto = (m - 1) * (m -2) * m;

        System.out.println(nFacto / mFacto);
        System.out.println(m);
        
    }


}