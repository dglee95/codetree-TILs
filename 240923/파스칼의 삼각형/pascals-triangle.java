import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else if (j < i) {
                    // System.out.printf("i = %d, j = %d\n", i, j);
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    // System.out.print("test");
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    System.out.printf("%d ", arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}