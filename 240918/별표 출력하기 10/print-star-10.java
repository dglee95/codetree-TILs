import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < (i / 2) + 1; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = i; j < (i / 2) + 6; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }
}