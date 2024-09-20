import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] countArr = new int[6];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            countArr[arr[i] - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("%d - %d\n", i + 1, countArr[i]);
        }
    }
}