import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTest = sc.nextInt();
        for (int i = 0; i < soTest; i++) {
            int n = sc.nextInt();
            int dem = 0;
            for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) {
                    if (j % 2 == 0) {
                        dem = dem + 1;
                    }
                    if ((n / j) % 2 == 0 && j != n / j) {
                        dem = dem + 1;
                    }
                }
            }
            System.out.println(dem);
        }
        sc.close();
    }
}
