import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.isEmpty())
                break;
            System.out.println(str);
        }

        sc.close();
    }
}
