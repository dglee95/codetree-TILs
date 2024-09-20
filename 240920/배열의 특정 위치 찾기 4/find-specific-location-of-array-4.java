import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
            cnt++;
        }

        int 개수 = 0;
        int 합계 = 0;

        for (int i = 0; i < cnt; i++) {
            if (arr[i] % 2 == 0) {
                개수++;
                합계 += arr[i];
            }
        }
        System.out.printf("%d %d", 개수, 합계);

    }
}