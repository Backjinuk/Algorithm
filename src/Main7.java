import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String regexPattern = String.join("|", croatia);
        Pattern pattern = Pattern.compile(regexPattern);

        Matcher matcher = pattern.matcher(inputValue);

        int length = 0;
        while (matcher.find()){
            length++;
        }

        System.out.println(inputValue.replaceAll(regexPattern, "").length() + length);
    }
}
