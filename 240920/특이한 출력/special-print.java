import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("(%d, %d) ", (i + 1), (j + 1));
                if ((i + j + 2) % 4 == 0) {
                    System.out.println();
                }
            }
        }
    }
}