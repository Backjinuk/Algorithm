import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int sum = x + y + z;
        String answer = "";

        if(sum != 180){
            answer = "Error";
        } else {
            // 모든 각이 60도인 경우
            if(x == 60 && y == 60 && z == 60){
                answer = "Equilateral";
            }
            // 두 각이 같은 경우
            else if(x == y || y == z || z == x){
                answer = "Isosceles";
            }
            // 모든 각이 다른 경우
            else{
                answer = "Scalene";
            }
        }

        sc.close();

        System.out.println(answer);
    }
}