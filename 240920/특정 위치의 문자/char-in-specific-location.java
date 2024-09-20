import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        int idx = -1;

        for (int i = 0; i < 6; i++) {
            if (arr[i] == c) {
                idx = i;
            }
        }

        if (idx > -1) {
            System.out.print(idx);
        } else {
            System.out.print("None");
        }

    }
}