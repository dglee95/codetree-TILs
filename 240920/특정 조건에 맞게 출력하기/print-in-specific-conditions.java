import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int index = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < index; i++) {
            if (arr[i] % 2 == 1) {
                System.out.printf("%d ", arr[i] + 3);
            } else {
                System.out.printf("%d ", arr[i] / 2);
            }
            
        }
    }
}