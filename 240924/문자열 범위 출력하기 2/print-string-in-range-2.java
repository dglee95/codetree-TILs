import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int len = str.length();
        if (n > len) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(str.length() - i - 1));
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(str.charAt(str.length() - i - 1));
            }
        }

        
    }
}