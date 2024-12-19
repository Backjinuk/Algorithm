import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArray = new String[5];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = sc.nextLine();
        }

        int maxLen = 0;
        for (String str : strArray) {
            maxLen = Math.max(maxLen, str.length());
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            for (String str : strArray) {
                if (i < str.length()) { 
                    result.append(str.charAt(i));
                }
            }
        }

        System.out.println(result.toString());


    }
}
