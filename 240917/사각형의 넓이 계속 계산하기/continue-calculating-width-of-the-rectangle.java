import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int 가로 = sc.nextInt();
            int 세로 = sc.nextInt();
            char c = sc.next().charAt(0);

            System.out.println(가로 * 세로);
        }
    }
}