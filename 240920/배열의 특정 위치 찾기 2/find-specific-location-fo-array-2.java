import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int a = 0;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
                a += arr[i];
            } else {
                b += arr[i];
            }
        }

        if (a >= b) {
            System.out.print(a - b);
        } else {
            System.out.print(b - a);
        }
    }
}