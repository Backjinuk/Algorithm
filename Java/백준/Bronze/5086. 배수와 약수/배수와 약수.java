import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(x == 0 && y ==0){
                break;
            }

            String result = "";
            if(y % x == 0){
                result = "factor";
            }else if(x % y == 0){
                result = "multiple";
            }else {
                result = "neither";
            }

            System.out.println(result);
        }
    }
}