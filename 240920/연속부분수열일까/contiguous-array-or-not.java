import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int idx = 0;
        if (n1 - n2 + 1> 0) {
            int[] idxArr = new int[n1 - n2 + 1];
            for (int i = 0; i < n1 - n2 + 1; i++) {
                idxArr[idx] = -1;
                if (a[i] == b[0]) {
                    idxArr[idx++] = i;
                }
            }

            int cnt = 0;
            for (int i = 0; i < n1 - n2 + 1; i++) {
                int index = idxArr[i];
                if (index > -1) {
                    boolean check = true;
                    for (int j = 0; j < n2; j++) {
                        if (b[j] != a[index++]) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        cnt++;
                    }
                }
            }

            if (cnt > 0) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        } else {
            System.out.print("No");
        }
       



        // for (int i = 0; i < n2; i++) {
        //     for (int j = i; j < n1; j++) {
        //         idxArr[i] = -1;
        //         if (a[j] == b[i]) {
        //             idxArr[i] = j;
        //             break;
        //         }
        //     }
        // }

        // for (int i = 0; i < n2; i++) {
        //     System.out.printf("%d ", idxArr[i]);
        // }
        // System.out.println();

        // boolean check = true;
        // if (idxArr[0] > -1) {
        //     for (int i = 1; i < n2; i++) {
        //         if (idxArr[i] != idxArr[i - 1] + 1) {
        //             check = false;
        //         }
        //     }
        //     if (check) 
        //         System.out.print("Yes");
        //     else
        //         System.out.print("No");
        // } else {
        //     System.out.print("No");
        // }

        
    }
}