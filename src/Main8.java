import java.util.Scanner;
import java.util.Stack;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 0; i < count; i++) {
            String word = sc.nextLine();

            if (isGroup(word)) {
                sum++;
            }
        }

        System.out.println(sum);
    }

    private static boolean isGroup(String word) {
        Stack<Character> stack = new Stack<>();

        for (char current : word.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() != current && stack.contains(current)) {
                return false;
            }
            stack.push(current);
        }

        return true;
    }
}
