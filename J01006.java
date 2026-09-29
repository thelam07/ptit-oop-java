import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();
        for (int i = 0; i < soTest; i++) {
            int n = sc.nextInt();
            long a = 1;
            long b = 1;

            for (int j = 0; j < n - 2; j++) {
                long tam = a + b;
                a = b;
                b = tam;
            }
            System.out.println(b);
        }
        sc.close();
    }
}
