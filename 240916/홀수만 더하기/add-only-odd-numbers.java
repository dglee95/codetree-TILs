import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumVal = 0;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val % 2 == 1 && val % 3 == 0) {
                sumVal += val;
            }
        }
        System.out.print(sumVal);
    }
}