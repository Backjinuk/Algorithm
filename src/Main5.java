import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        String reversStr = sb.reverse().toString();


        if(str.equals(reversStr)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        sc.close();
    }
}
