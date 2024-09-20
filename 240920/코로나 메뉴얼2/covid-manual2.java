import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[4];
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            char yn = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (temp >= 37) {
                if (yn == 'Y')
                    countArr[0]++;
                else 
                    countArr[1]++;
            } else {
                if (yn == 'Y')
                    countArr[2]++;
                else
                    countArr[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d ", countArr[i]);
        }
        if (countArr[0] >= 2) {
            System.out.print("E");
        }
    }
}