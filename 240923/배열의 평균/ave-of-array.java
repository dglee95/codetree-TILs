import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                if (i == 0) {
                    sum1 += arr[i][j];
                } else {
                    sum2 += arr[i][j];
                }

                if (j == 0) {
                    sum3 += arr[i][j];
                } else if (j == 1) {
                    sum4 += arr[i][j];
                } else if (j == 2) {
                    sum5 += arr[i][j];
                } else {
                    sum6 += arr[i][j];
                }

                sum7 += arr[i][j];
            }
        }

        System.out.printf("%.1f %.1f\n%.1f %.1f %.1f %.1f\n%.1f", (double) sum1 / 4, (double) sum2 / 4, (double) sum3 / 2, (double) sum4 / 2, (double) sum5 / 2, (double) sum6 / 2, (double) sum7 / 8);
    }
}