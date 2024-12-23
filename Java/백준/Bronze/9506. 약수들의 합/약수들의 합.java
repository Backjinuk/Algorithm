import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int N = sc.nextInt();
            List<Integer> intList = new ArrayList<>();

            if(N < 0){
                break;
            }
            
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    intList.add(i);
                }
            }

            int total = intList.stream().mapToInt(Integer::intValue).sum();

            if (total == N) {
                System.out.print(N + " = ");

                String result = "";
                for (int i = 0; i < intList.size(); i++) {
                    if (i != 0) {
                        result += " + ";
                    }
                    result += intList.get(i);
                }

                System.out.println(result);
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}