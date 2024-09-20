import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int n = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 250) {
                n = i;
                break;
            }
        }

        int sum = 0;
        double avg;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            avg = (double) sum / n;
        } else {
            for (int i = 0; i < 10; i++) {
                sum += arr[i];
            }
            avg = (double) sum / 10;
        }

        System.out.printf("%d %.1f", sum, avg);

    }
}