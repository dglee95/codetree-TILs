import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int index = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                index = i;
                break;
            }
        }

        if (index > 0) {
            for (int i = 0; i < index; i++) {
                System.out.printf("%d ", arr[index - i - 1]);

            }   
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d ", arr[9 - i]);
            }   
        }
        


    }
}