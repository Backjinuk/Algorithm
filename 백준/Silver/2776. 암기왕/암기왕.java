import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 수
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            // 첫 번째 배열 크기와 배열 입력
            int n1 = Integer.parseInt(br.readLine());
            int[] note = new int[n1];
            String[] noteInput = br.readLine().split(" ");
            for (int j = 0; j < n1; j++) {
                note[j] = Integer.parseInt(noteInput[j]);
            }

            // 배열 정렬
            Arrays.sort(note);

            // 두 번째 배열 크기와 배열 입력
            int n2 = Integer.parseInt(br.readLine());
            String[] queryInput = br.readLine().split(" ");

            // 결과를 저장할 StringBuilder
            StringBuilder sb = new StringBuilder();

            // 이진 탐색으로 숫자 확인
            for (int j = 0; j < n2; j++) {
                int num = Integer.parseInt(queryInput[j]);
                if (binarySearch(note, num)) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }

            // 결과 출력
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean binarySearch(int[] note, int num) {
        int left = 0;
        int right = note.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (note[mid] == num) {
                return true;
            } else if (note[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
