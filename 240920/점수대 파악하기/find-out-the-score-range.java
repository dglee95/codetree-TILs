import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] countArr = new int[11];

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            countArr[arr[i] / 10]++;
            if (arr[i] == 0) {
                break;
            }
        }

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d - %d\n", (11 - i) * 10, countArr[11 - i]);
        }
    }
}