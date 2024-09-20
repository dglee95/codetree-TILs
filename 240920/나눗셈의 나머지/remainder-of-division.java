import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] countArr = new int[b];
        while (a > 1) {
            countArr[a % b]++;
            a /= b;
        }

        int sum = 0;
        for (int i = 0; i < b; i++) {
            if (countArr[i] != 0) {
                sum += countArr[i] * countArr[i];
            }
        }
        System.out.print(sum);
    }
}