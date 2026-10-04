import java.util.Scanner;

public class J01021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long MOD = 1000000007;

        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == 0 && b == 0) {
                break;
            }

            long kq = 1;
            a = a % MOD;

            while (b > 0) {
                if (b % 2 == 1) {
                    kq = kq * a % MOD;
                }
                a = a * a % MOD;
                b = b / 2;
            }

            System.out.println(kq);
        }

        sc.close();
    }
}