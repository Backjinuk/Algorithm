import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> gradeMap = Map.of(
                "A+", 4.5,
                "A0", 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
        );

        double totalSum = 0;
        double creditSum = 0;
        for (int i = 0; i < 20; i++) {
            String[] input = sc.nextLine().split(" ");
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];

            if (!grade.equals("P")) {
                totalSum += credit * gradeMap.get(grade);
                creditSum += credit; // P 학점도 학점 총합에 포함
            }
        }

        // P 학점을 제외한 평점 평균 계산
        double avg = totalSum / creditSum;
        System.out.printf("%.6f", avg);

        sc.close();
    }
}
