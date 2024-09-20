import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int result = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                sum += arr[i];
            }

            if (i % 3 == 2) {
                result += arr[i];
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum, (double) result / cnt);
    }
}