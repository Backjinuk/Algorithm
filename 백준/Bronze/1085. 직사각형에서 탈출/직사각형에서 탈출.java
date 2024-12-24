import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // 각 가장자리까지의 거리 계산
        int distanceLeft = x;          // 왼쪽 가장자리까지의 거리
        int distanceRight = w - x;     // 오른쪽 가장자리까지의 거리
        int distanceBottom = y;        // 아래 가장자리까지의 거리
        int distanceTop = h - y;       // 위 가장자리까지의 거리

        // 최소 거리 찾기
        int minDistance = Math.min(Math.min(distanceLeft, distanceRight), Math.min(distanceBottom, distanceTop));

        System.out.println(minDistance);

    }

}