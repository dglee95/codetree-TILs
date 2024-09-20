import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        int[] arr = new int[n];
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }

        int index = 0;
        int[] result = new int[cnt];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }
        
        for (int i = 0; i < cnt; i++) {
            System.out.printf("%d ", result[i]);
        }
    }
}