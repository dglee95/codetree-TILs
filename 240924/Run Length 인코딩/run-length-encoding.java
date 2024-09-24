import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        char c = A.charAt(0);

        StringBuilder builder = new StringBuilder();
        int cnt = 1;

        int len = 0;

        if (A.length() == 1) {
            builder.append(c).append(cnt);
        } else {
            for (int i = 1; i < A.length(); i++) {
                if (A.charAt(i - 1) == A.charAt(i)) {
                    cnt++;
                } else {
                    builder.append(c);
                    builder.append(cnt);
                    cnt = 1;
                    c = A.charAt(i);
                }

                if (i == A.length() - 1) {
                    builder.append(c);
                    builder.append(cnt);
                }
            }
        }
        System.out.println(builder.length());
        System.out.println(builder);
    }
}