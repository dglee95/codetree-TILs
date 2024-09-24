import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        int[] arr = new int[]{len1, len2, len3};
        int maxVal = len1;
        int minVal = len1;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        System.out.print(maxVal - minVal);


    }
}