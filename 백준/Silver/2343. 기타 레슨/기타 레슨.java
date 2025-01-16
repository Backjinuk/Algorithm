import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(binarySearch(arr, m));
    }

    private static int binarySearch(int[] arr, int m) {
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int result = high;

       while(low <= high){
           int mid = (low + high) / 2;

           if(countBuleRay(arr, mid) <= m){
            result = mid;
            high = mid - 1;
           }else{
              low = mid + 1;
           }

       }
        return result;
    }

    private static int countBuleRay(int[] arr, int mid) {
        int count = 1;
        int sum = 0;

        for (int len : arr) {
            if((len + sum) > mid){
                count++;
                sum = len;
            }else{
                sum += len;
            }
        }
        return count;
    }

}
