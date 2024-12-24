import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> integerList= new LinkedList<Integer>();

        for (int i = M; i <= N; i++) {
            if(isPrim(i)){
                integerList.add(i);
            }
        }
        int max = integerList.stream().mapToInt(Integer::intValue).sum();
        OptionalInt min = integerList.stream().mapToInt(Integer::intValue).min();

        if (!integerList.isEmpty()) {
            System.out.println(max);
            System.out.println(min.getAsInt());
        }else{
            System.out.println(-1);
        }
    }

    public static boolean isPrim(int number){
        if(number == 1){
            return false;
        }

        if(number == 2){
            return true;
        }

        if(number % 2 == 0){
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i+=2) {
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }



}