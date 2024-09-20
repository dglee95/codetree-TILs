import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        int maxVal = INT_MIN;
        int minVal = INT_MAX;

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 999 || arr[i] == -999) {
                break;
            }

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        System.out.printf("%d %d", maxVal, minVal);
    }
}