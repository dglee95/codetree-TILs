public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d * %d = %d ", i, j, i * j);
                if (j == 19) {
                    
                } else if (j % 2 == 1) {
                    System.out.print("/ ");
                } else {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}