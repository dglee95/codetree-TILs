import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt();
                System.out.printf("%d\n", arr[a - 1]);
            } else if (type == 2) {
                int b = sc.nextInt();
                int idx = -1;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        idx = j;
                        break;
                    }
                }
                if (idx > 0) {
                    System.out.println(idx + 1);
                } else {
                    System.out.println(0);
                }
            } else {
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s; j <= e; j++) {
                    System.out.printf("%d ", arr[j - 1]);
                }
                System.out.println();
            }
        }
    }
}