import java.util.Scanner;

public class Main {
   static int k;
   static char[] signs;
   static boolean[] visited = new boolean[10];
   static String minValue = "";
   static String maxValue = "";


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        signs = new char[k];

        for(int i = 0; i < k; i++) {
            signs[i] = sc.next().charAt(0);
        }


        dfs(0, "");

        System.out.println(maxValue);
        System.out.println(minValue);
    }

    private static void dfs(int depth, String num) {
        if(depth == k + 1) {
            if(minValue.equals("") || num.compareTo(minValue) < 0) {
                minValue = num;
            } else if (maxValue.equals("") || num.compareTo(maxValue) > 0) {
                maxValue = num;
            }

            return;
        }

        for(int i = 0; i < 10; i++) {
            if(visited[i]) continue;
            if(depth == 0 || check(num.charAt(depth - 1) - '0', i, signs[depth - 1])) {
                visited[i] = true;
                dfs(depth + 1, num + i);
                visited[i] = false;
            }
        }

    }

    private static boolean check(int a, int b, char sign) {
        if(sign == '<') {
            if(a > b) {
                return false;
            }
        } else if(sign == '>') {
            if(a < b) {
                return false;
            }
        }
        return true;
    }
}
