import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];

        for (int i = 0; i < arr.length; i++) {
            char c = sc.next().charAt(0);
            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%c", arr[9 - i]);
        }
    }
}