import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.printf("%c", c);
                    c++;
                    if (c == 'Z' + 1) {
                        c = 'A';
                    }
                }
            }
            System.out.println();
        }
    }
}