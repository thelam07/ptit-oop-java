import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();
        for (int i = 0; i < soTest; i++) {
            long n = sc.nextLong();
            long a = 0;
            long b = 1;
            while (a < n) {
                long tam = a + b;
                a = b;
                b = tam;
            }
            if (a == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
