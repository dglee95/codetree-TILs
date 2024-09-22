import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        final int INT_MIN = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int maxVal = arr[0];
        for (int i = 0; i < n; i++) {
            boolean check = true;

            for (int j = i + 1; j < n; j++) {
                if (maxVal == arr[j]) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.print(maxVal);
                break;
            } else {
                if (i + 2 >= n) {
                    System.out.print(-1);
                    break;
                } else {
                    maxVal = arr[i + 2];
                    i++;
                }
            }
        }
    }
}