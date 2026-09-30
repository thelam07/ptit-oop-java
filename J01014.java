import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();

        for (int t = 0; t < soTest; t++) {
            long n = sc.nextLong();
            long lonNhat = 1;

            for (long i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    lonNhat = i;
                    n = n / i;
                }
            }
            if (n > 1) {
                lonNhat = n;
            }
            System.out.println(lonNhat);
        }

        sc.close();
    }
}
