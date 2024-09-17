import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean check = false;
        for (int = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                check = true;
                break;
            }
        }

        System.out.print(check ? 1 : 0);
    }
}