import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); // 랜선 개수
        int n = sc.nextInt(); // 필요한 랜선 개수

        long[] arr = new long[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }

        // 이분 탐색 시작
        System.out.println(binarySearchCount(arr, n));
    }

    private static long binarySearchCount(long[] arr, int n) {
        long left = 1; // 최소 길이
        long right = Arrays.stream(arr).max().orElse(0); // 최대 랜선 길이
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2; // 중간값 구하기
            int count = 0;

            for (long x : arr) {
                count += x / mid; // mid 길이로 나눈 랜선 개수 계산
            }

            if (count >= n) {
                result = mid; // 조건을 만족하면 결과 저장
                left = mid + 1; // 더 큰 길이를 탐색
            } else {
                right = mid - 1; // 더 작은 길이를 탐색
            }
        }

        return result;
    }
}
