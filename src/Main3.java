import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value1 = sc.nextInt();
        sc.nextLine();
        String[] array = sc.nextLine().split("");

        int sum = 0;
        for (int i = 0; i < value1; i++) {
            sum += Integer.parseInt(array[i]);
        }

        System.out.println(sum);

        sc.close();
    }
}
