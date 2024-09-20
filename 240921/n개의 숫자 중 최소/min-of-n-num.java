import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int minVal = INT_MAX;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == minVal) {
                cnt++;
            }
        }
        
        System.out.printf("%d %d", minVal, cnt);
    }
}