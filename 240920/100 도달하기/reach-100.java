import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[12];

        arr[0] = 1;
        arr[1] = sc.nextInt();

        for (int i = 2; i < 12; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];

            System.out.printf("%d ", arr[i - 2]);
            if (arr[i] > 100) {
                System.out.printf("%d ", arr[i - 1]);
                System.out.printf("%d ", arr[i]);
                break;
            }
        }
    }
}