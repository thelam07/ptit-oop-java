import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();
        for (int t = 1; t <= soTest; t++) {
            int n = sc.nextInt();

            System.out.print("Test " + t + ": ");

            for (int i = 2; i * i <= n; i++) {
                int dem = 0;
                while (n % i == 0) {
                    dem++;
                    n = n / i;
                }
                if (dem > 0) {
                    System.out.print(i + "(" + dem + ") ");
                }
            }
            if (n > 1) {
                System.out.print(n + "(1) ");
            }
            System.out.println();
        }

        sc.close();
    }
}
