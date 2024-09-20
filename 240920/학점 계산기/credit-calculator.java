import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double result = sum / n;
        System.out.printf("%.1f\n", result);
        if (result >= 4.0) {
            System.out.printf("Perfect");
        } else if (result >= 3.0) {
            System.out.printf("Good");
        } else {
            System.out.printf("Poor");
        }
        
    }
}