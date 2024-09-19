import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.printf("%d ", cnt % 10);
                    cnt++;
                    if (cnt == 10) {
                        cnt = 1;
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}