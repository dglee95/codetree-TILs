import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = INT_MIN;
        int minVal = INT_MAX;

        for (int i = 0; i < 10; i++) {
            if (arr[i] < 500 && arr[i] > maxVal) {
                maxVal = arr[i];
            }

            if (arr[i] > 500 && arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        System.out.printf("%d %d", maxVal, minVal);
    }
}